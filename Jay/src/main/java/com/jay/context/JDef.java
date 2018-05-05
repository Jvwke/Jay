package com.jay.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.jay.Jay;
import com.jay.lang.JBaseVisitor;
import com.jay.lang.JParser;
import com.jay.lang.JParser.Import_listContext;
import com.jay.lang.JParser.ImportsContext;
import com.jay.lang.JParser.Statement_listContext;
import com.jay.type.JFunction;
import com.jay.type.JImport;
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

    private Map<String, JFunction> functions = new HashMap<>();

    @Override
    public JValue visitFunction(JParser.FunctionContext ctx) {
        List<TerminalNode> parameters = ctx.id_list() != null ? ctx.id_list().ID() : Collections.emptyList();
        Statement_listContext statements = ctx.statement_list();
        String id = ctx.name.getText(), t = ctx.r == null ? "nil" : ctx.r.getText();

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

    public Map<String, JFunction> getFunctions() {
        return functions;
    }

    public ParseTree getTree() {
        return tree;
    }

    public String getFileName() {
        return fileName;
    }
}
