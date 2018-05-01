package com.jay.type;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.jay.context.JRunVisitor;
import com.jay.context.JScope;
import com.jay.lang.JParser.Statement_listContext;

public class JFunction {
    private JType returnType;

    private List<TerminalNode> parameters;
    private Statement_listContext statements;

    public JFunction(JType type, List<TerminalNode> parameters, Statement_listContext statements) {
        returnType = type;

        this.parameters = parameters;
        this.statements = statements;
    }

    public JValue invoke(JScope scope, HashMap<String, JFunction> functions, List<JValue> paramValues) {
        scope = new JScope(scope);
        JRunVisitor visitor = new JRunVisitor(scope, functions);

        int len = paramValues.size();
        for (int i = 0; i < len; i++) {
            JValue paramValue = paramValues.get(i);

            scope.setDeclaredType(paramValue.getType());
            scope.declareVariable(parameters.get(i).getText(), paramValue);
        }

        JValue returnValue = null;

        try {
            visitor.visit(statements);
        } catch (JReturn ex) {
            returnValue = ex.getReturnValue();

            if (!returnType.isCompatible(returnValue.getType())) {
                throw new UnsupportedOperationException();
            }
        }

        return returnValue;
    }
}
