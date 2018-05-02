package com.jay.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.jay.lang.JBaseListener;
import com.jay.lang.JParser;
import com.jay.lang.JParser.Statement_listContext;
import com.jay.type.JFunction;
import com.jay.type.JType;

public class JDefListener extends JBaseListener {

    private Map<String, JFunction> functions= new HashMap<>();

    public void enterFunction(JParser.FunctionContext ctx) {
        List<TerminalNode> parameters = ctx.id_list() != null ? ctx.id_list().ID() : Collections.emptyList();
        Statement_listContext statements = ctx.statement_list();
        String fId = ctx.name.getText(), id = fId + "@" + parameters.size(),
                t = ctx.r == null ? "nil" : ctx.r.getText();

        functions.put(id, new JFunction(JType.find(t), parameters, statements));
    }

    public Map<String, JFunction> getFunctions() {
        return functions;
    }
}
