package com.jay.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import com.jay.exception.JException;
import com.jay.lang.JBaseVisitor;
import com.jay.lang.JParser;
import com.jay.lang.JParser.ExpressionContext;
import com.jay.lang.JParser.Expression_listContext;
import com.jay.type.JArray;
import com.jay.type.JBool;
import com.jay.type.JCompare;
import com.jay.type.JFloat;
import com.jay.type.JFunction;
import com.jay.type.JInteger;
import com.jay.type.JNil;
import com.jay.type.JReturn;
import com.jay.type.JString;
import com.jay.type.JType;
import com.jay.type.JValue;

public class JRunVisitor extends JBaseVisitor<JValue> {
    private JScope scope;
    private Map<String, JFunction> functions;

    public JRunVisitor() {
        this(new JScope(), new HashMap<>());
    }

    public JRunVisitor(Map<String, JFunction> functions) {
        this(new JScope(), functions);
    }
    
    public JRunVisitor(JScope scope, Map<String, JFunction> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    @Override
    public JValue visitProgram(JParser.ProgramContext ctx) {

        for (ParseTree child : ctx.children) {
            visit(child);
        }

        return null;
    }

    @Override
    public JValue visitFunction(JParser.FunctionContext ctx) {
//        List<TerminalNode> parameters = ctx.id_list() != null ? ctx.id_list().ID() : Collections.emptyList();
//        Statement_listContext statements = ctx.statement_list();
//        String fId = ctx.name.getText(), id = fId + "@" + parameters.size(),
//                t = ctx.r == null ? "nil" : ctx.r.getText();
//
//        functions.put(id, new JFunction(JType.find(t), parameters, statements));
        return null;
    }

    /* Begin Statement */
    @Override
    public JValue visitStatementDeclaration(JParser.StatementDeclarationContext ctx) {
        String t = ctx.CONST_TYPE() == null ? "nil" : ctx.CONST_TYPE().getText();

        scope.setDeclaredType(JType.find(t));
        visit(ctx.assignment_list());

        return null;
    }

    @Override
    public JValue visitStatementAssignment(JParser.StatementAssignmentContext ctx) {
        JParser.ExpressionContext eIndex = ctx.i;
        JValue value = visit(ctx.v);
        String id = ctx.ID().getText();

        if (eIndex == null) {
            scope.assignVariable(id, value);
        }

        else {
            JValue index = visit(eIndex);

            if (index instanceof JInteger) {
                scope.assignVariableInArray(((JInteger) index).getValue(), id, value);
            } else {
                throw JException.variableIsNotArray(id);
            }
        }

        return null;
    }

    @Override
    public JValue visitStatementIf(JParser.StatementIfContext ctx) {
        List<JParser.Or_expressionContext> bools = ctx.or_expression();
        boolean visited = false;

        scope = new JScope(scope);

        for (int i = 0; i < bools.size() && !visited; i++) {
            if ((Boolean) visit(bools.get(i)).getValue()) {
                visit(ctx.statement_list(i));
                visited = true;
                break;
            }
        }

        if (!visited && bools.size() + 1 == ctx.statement_list().size()) {// else
            visit(ctx.statement_list(bools.size()));
        }
        scope = scope.getParent();
        return null;
    }

    @Override
    public JValue visitStatementWhile(JParser.StatementWhileContext ctx) {
        while (((JBool) visit(ctx.or_expression())).getValue()) {
            scope = new JScope(scope);
            visit(ctx.statement_list());
            scope = scope.getParent();
        }

        return null;
    }

    @Override
    public JValue visitStatementForAssignment(JParser.StatementForAssignmentContext ctx) {
        JValue v1 = visit(ctx.expression(0)), v2 = visit(ctx.expression(1));
        String id = ctx.ID().getText();
        Integer step = 1;
        if(ctx.term() != null) {
            JValue v = visit(ctx.term());
            step = ((JInteger)v).getValue();
        }

        if (v1.getType() == JType.INTEGER && v2.getType() == JType.INTEGER) {
            int n1 = (Integer) v1.getValue(), n2 = (Integer) v2.getValue();

            if (!scope.hasVariable(id))
                scope.declareVariable(id, v1);

            if(n1 <= n2) {
                for (; n1 <= n2; n1 += step) {
                    scope.assignVariable(id, new JInteger(n1));
                    scope = new JScope(scope);
                    visit(ctx.statement_list());
                    scope = scope.getParent();

                    n1 = (Integer) scope.getVariable(id).getValue();
                }
            } else {
                step = -1 * Math.abs(step);
                for (; n1 >= n2; n1 += step) {
                    scope.assignVariable(id, new JInteger(n1));
                    scope = new JScope(scope);
                    visit(ctx.statement_list());
                    scope = scope.getParent();

                    n1 = (Integer) scope.getVariable(id).getValue();
                }
            }
        }

        return null;
    }

    @Override
    public JValue visitStatementFor(JParser.StatementForContext ctx) {
        String id = ctx.ID().getText();
        JValue v1 = scope.getVariable(id), v2 = visit(ctx.expression());
        Integer step = 1;
        if(ctx.term() != null) {
            JValue v = visit(ctx.term());
            step = ((JInteger)v).getValue();
        }

        if (v1.getType() == JType.INTEGER && v2.getType() == JType.INTEGER) {
            int n1 = (Integer) v1.getValue(), n2 = (Integer) v2.getValue();

            if(n1 <= n2) {
                for (; n1 <= n2; n1 += step) {
                    scope.assignVariable(id, new JInteger(n1));
                    scope = new JScope(scope);
                    visit(ctx.statement_list());
                    scope = scope.getParent();

                    n1 = (Integer) scope.getVariable(id).getValue();
                }
            } else {
                step = -1 * Math.abs(step);
                for (; n1 >= n2; n1 += step) {
                    scope.assignVariable(id, new JInteger(n1));
                    scope = new JScope(scope);
                    visit(ctx.statement_list());
                    scope = scope.getParent();

                    n1 = (Integer) scope.getVariable(id).getValue();
                }
            }
        }

        return null;
    }

    @Override
    public JValue visitStatementReturn(JParser.StatementReturnContext ctx) {
        JValue value = ctx.expression() != null ? visit(ctx.expression()) : new JNil(null);

        throw new JReturn(value);
    }

    @Override
    public JValue visitStatementFunctionCall(JParser.StatementFunctionCallContext ctx) {
        return visit(ctx.function_call());
    }
    /* End Statement */

    /* Begin Add Expression */
    @Override
    public JValue visitAdd_expressionAddOp(JParser.Add_expressionAddOpContext ctx) {
        JValue v1 = visit(ctx.mult_expression()), v2 = visit(ctx.add_expression());

        switch (ctx.op.getText()) {
        case "+":
            return v1.add(v2);

        case "-":
            return v1.subtract(v2);
        }

        return null;
    }

    @Override
    public JValue visitExpression_list(Expression_listContext ctx) {
        List<ExpressionContext> exps = ctx.expression();
        JArray arr = new JArray(JType.NIL, exps.size());
        for (int i = 0; i < exps.size(); i++) {
            ExpressionContext exp = exps.get(i);
            arr.set(i, visit(exp));
        }
        return arr;
    }

    @Override
    public JValue visitAdd_expressionMultExpression(JParser.Add_expressionMultExpressionContext ctx) {
        return visit(ctx.mult_expression());
    }
    /* End Add Expression */

    /* Begin Mult Expression */
    @Override
    public JValue visitMult_expressionMultOp(JParser.Mult_expressionMultOpContext ctx) {
        JValue v1 = visit(ctx.term()), v2 = visit(ctx.mult_expression());

        switch (ctx.op.getText()) {
        case "*":
            return v1.multiply(v2);

        case "/":
            return v1.divide(v2);
        }

        return null;
    }

    @Override
    public JValue visitMult_expressionTerm(JParser.Mult_expressionTermContext ctx) {
        return visit(ctx.term());
    }
    /* End Mult Expression */

    /* Begin Term */
    @Override
    public JValue visitTermExpression(JParser.TermExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public JValue visitTermVariable(JParser.TermVariableContext ctx) {
        JParser.ExpressionContext eIndex = ctx.i;
        String id = ctx.ID().getText();

        if (eIndex == null) {
            return scope.getVariable(id);
        } else {
            JValue index = visit(eIndex);

            if (index instanceof JInteger) {
                return scope.getValueInArray(((JInteger) index).getValue(), id);
            }
            throw JException.variableIsNotArray(id);
        }
    }

    @Override
    public JValue visitTermInt(JParser.TermIntContext ctx) {
        return new JInteger(ctx.CONST_INT().getText());
    }

    @Override
    public JValue visitTermFloat(JParser.TermFloatContext ctx) {
        return new JFloat(ctx.CONST_FLOAT().getText());
    }

    @Override
    public JValue visitTermString(JParser.TermStringContext ctx) {
        String str = ctx.CONST_STRING().getText();
        return new JString(str.substring(1, str.length() - 1));
    }
    /* End Term */

    /* Begin Bool Expression Or */
    @Override
    public JValue visitOr_expressionOp(JParser.Or_expressionOpContext ctx) {
        JBool b1 = (JBool) visit(ctx.and_expression(0)), b2 = (JBool) visit(ctx.and_expression(1));

        return new JBool(b1.getValue() || b2.getValue());
    }

    @Override
    public JValue visitOr_expressionAnd(JParser.Or_expressionAndContext ctx) {
        return visit(ctx.and_expression());
    }
    /* End Bool Expression Or */

    /* Begin Bool Expression And */
    @Override
    public JValue visitAnd_expressionOp(JParser.And_expressionOpContext ctx) {
        JBool b1 = (JBool) visit(ctx.bool_term(0)), b2 = (JBool) visit(ctx.bool_term(1));

        return new JBool(b1.getValue() && b2.getValue());
    }

    @Override
    public JValue visitAnd_expressionTerm(JParser.And_expressionTermContext ctx) {
        return visit(ctx.bool_term());
    }
    /* End Bool Expression Or */

    /* Begin Bool Term */
    @Override
    public JValue visitBool_termExpression(JParser.Bool_termExpressionContext ctx) {
        return visit(ctx.or_expression());
    }

    @Override
    public JValue visitBool_termCompare(JParser.Bool_termCompareContext ctx) {
        JValue v1 = visit(ctx.add_expression(0)), v2 = visit(ctx.add_expression(1));
        return JValue.compare(v1, v2, JCompare.find(ctx.COMPARE_OP().getText()));
    }

    @Override
    public JValue visitBool_termConst(JParser.Bool_termConstContext ctx) {
        return new JBool(ctx.b.getText());
    }

    @Override
    public JValue visitBool_termNot(JParser.Bool_termNotContext ctx) {
        return JValue.not(visit(ctx.bool_term()));
    }
    /* End Bool Term */

    @Override
    public JValue visitAssignmentListNonArray(JParser.AssignmentListNonArrayContext ctx) {
        scope.declareVariable(ctx.ID().getText(), visit(ctx.assignment()));

        return ctx.assignment_list() != null ? visit(ctx.assignment_list()) : null;
    }

    @Override
    public JValue visitAssignmentListArray(JParser.AssignmentListArrayContext ctx) {
        if (ctx.expression_list() != null) {
            JArray arr = (JArray) visit(ctx.expression_list());
            JArray result = new JArray(scope.getDeclaredType());
            int len = arr.length();
            for (int i = 0; i < len; i++) {
                result.set(i, arr.get(i));
            }
            scope.declareVariable(ctx.ID().getText(), result);
        } else {
            scope.declareVariable(ctx.ID().getText(), new JArray(scope.getDeclaredType()));
        }
        return ctx.assignment_list() != null ? visit(ctx.assignment_list()) : null;
    }

    @Override
    public JValue visitAssignment(JParser.AssignmentContext ctx) {
        return ctx.expression() == null ? new JNil(scope.getDeclaredType()) : visit(ctx.expression());
    }

    /* Begin Function Call */
    @Override
    public JValue visitFunctionCallId(JParser.FunctionCallIdContext ctx) {
        List<JValue> list = createParameterList(ctx.expression_list());
        String id = ctx.ID().getText() + "@" + list.size();

        return functions.get(id).invoke(scope, functions, list);
    }

    @Override
    public JValue visitFunctionCallWrite(JParser.FunctionCallWriteContext ctx) {
        List<JValue> list = createParameterList(ctx.expression_list());

        for (JValue v : list) {
            System.out.print(v);
        }

        System.out.println();

        return null;
    }

    @Override
    public JValue visitFunctionCallDynamic(JParser.FunctionCallDynamicContext ctx) {
        return new JBool(scope.getVariable(ctx.ID().getText()).isDynamic());
    }

    @Override
    public JValue visitFunctionCallCast(JParser.FunctionCallCastContext ctx) {
        JValue value = visit(ctx.expression());

        switch (ctx.CONST_TYPE().getText()) {
        case "int":
            return new JInteger(((Number) value.getValue()).intValue());

        case "float":
            return new JFloat(((Number) value.getValue()).doubleValue());

        case "string":
            return new JString(value.toString());

        default:
            return null;
        }
    }

    @Override
    public JValue visitFunctionCallTypeof(JParser.FunctionCallTypeofContext ctx) {
        return new JString(visit(ctx.expression()).getType().toString());
    }
    /* End Function Call */

    private void createParameterList(JParser.Expression_listContext ctx, List<JValue> list) {
        for (int i = 0; i < ctx.expression().size(); i++) {
            list.add(visit(ctx.expression(i)));
        }
    }

    @SuppressWarnings("unused")
    private void throwError(String message) {
        System.err.println("ERROR: " + message + ".");
        System.exit(-1);
    }

    private List<JValue> createParameterList(JParser.Expression_listContext ctx) {
        List<JValue> list = new ArrayList<>();

        if (ctx != null) {
            createParameterList(ctx, list);
        }
        return list;
    }
}
