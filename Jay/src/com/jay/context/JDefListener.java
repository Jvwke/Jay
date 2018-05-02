package com.jay.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.jay.Jay;
import com.jay.lang.JBaseListener;
import com.jay.lang.JParser;
import com.jay.lang.JParser.ImportsContext;
import com.jay.lang.JParser.Statement_listContext;
import com.jay.type.JFunction;
import com.jay.type.JType;

public class JDefListener extends JBaseListener {

    private Map<String, JFunction> functions = new HashMap<>();

    public void enterFunction(JParser.FunctionContext ctx) {
        List<TerminalNode> parameters = ctx.id_list() != null ? ctx.id_list().ID() : Collections.emptyList();
        Statement_listContext statements = ctx.statement_list();
        String fId = ctx.name.getText(), id = fId + "@" + parameters.size(),
                t = ctx.r == null ? "nil" : ctx.r.getText();

        functions.put(id, new JFunction(JType.find(t), parameters, statements));
    }

    @Override
    public void enterImports(ImportsContext ctx) {
        String fileName = ctx.file.getText();
        // trim left and right " or '
        fileName = fileName.substring(1, fileName.length() - 1);
        Map<String, JFunction> funcs = Jay.loadProgram(fileName);
        if (funcs != null) {
            functions.putAll(funcs);
        }
    }

    public Map<String, JFunction> getFunctions() {
        return functions;
    }
}
