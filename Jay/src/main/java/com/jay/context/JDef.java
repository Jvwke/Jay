package com.jay.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.jay.Jay;
import com.jay.exception.JException;
import com.jay.lang.JBaseVisitor;
import com.jay.lang.JParser;
import com.jay.lang.JParser.Import_listContext;
import com.jay.lang.JParser.ImportsContext;
import com.jay.lang.JParser.StatementDeclarationContext;
import com.jay.lang.JParser.Statement_listContext;
import com.jay.type.JArray;
import com.jay.type.JFloat;
import com.jay.type.JFunction;
import com.jay.type.JImport;
import com.jay.type.JInteger;
import com.jay.type.JNil;
import com.jay.type.JString;
import com.jay.type.JType;
import com.jay.type.JValue;

public class JDef extends JBaseVisitor<JValue> {

    private ParseTree tree;
    private String fileName;

    public JDef(String fileName, ParseTree tree) {
        super();
        this.fileName = fileName;
        this.tree = tree;
    }

    private JScope scope = new JScope();
    private Map<String, JFunction> functions = new HashMap<>();

    @Override
    public JValue visitFunction(JParser.FunctionContext ctx) {
        List<TerminalNode> parameters = ctx.id_list() != null ? ctx.id_list().ID() : Collections.emptyList();
        Statement_listContext statements = ctx.statement_list();
        String id = ctx.name.getText() + "#" + parameters.size(), t = ctx.r == null ? "nil" : ctx.r.getText();

        functions.put(id, new JFunction(JType.find(t), parameters, statements));
        return null;
    }

    @Override
    public JValue visitImport_list(Import_listContext ctx) {
        List<ImportsContext> imports = ctx.imports();
        for (ImportsContext im : imports) {
            try {
                visit(im);
            } catch (JImport e) {
            }
        }
        return null;
    }

    @Override
    public JValue visitImports(ImportsContext ctx) {
        String fileName = ctx.file.getText();
        // trim left and right " or '
        fileName = fileName.substring(1, fileName.length() - 1);

        if (Jay.isFileLoaded(fileName)) {
            throw new JImport();
        }
        JDef def = Jay.loadProgram(fileName);
        if (def.getFunctions() != null) {
            functions.putAll(def.getFunctions());
        }
        Jay.registerFile(fileName);
        return null;
    }

    @Override
    public JValue visitStatementDeclaration(StatementDeclarationContext ctx) {
        if (ctx.PUBLIC() == null) {
            return null;
        }
        String t = ctx.CONST_TYPE() == null ? "nil" : ctx.CONST_TYPE().getText();

        scope.setDeclaredType(JType.find(t));
        visit(ctx.assignment_list());
        return null;
    }

    @Override
    public JValue visitStatementAssignment(JParser.StatementAssignmentContext ctx) {
        String id = ctx.ID().getText();
        if (!scope.hasVariable(id)) {
            return null;
        }

        JParser.ExpressionContext eIndex = ctx.i;
        JValue value = visit(ctx.v);

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

    public Map<String, JFunction> getFunctions() {
        return functions;
    }

    public Map<String, JValue> getVariables() {
        return scope.getVariables();
    }

    public ParseTree getTree() {
        return tree;
    }

    public String getFileName() {
        return fileName;
    }
}
