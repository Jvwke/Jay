package com.jay;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.jay.context.JDefListener;
import com.jay.context.JRunVisitor;
import com.jay.lang.JLexer;
import com.jay.lang.JParser;

public class Jay {
    public static void main(String[] args) {
        String fileName = null;
        if (args.length > 0) {
            fileName = args[0];
        }

        CharStream input = null;
        if (fileName != null) {
            try {
                input = CharStreams.fromFileName(fileName);
            } catch (IOException e) {
                System.err.printf("ERROR: Failed to load %s\n.", fileName);
                e.printStackTrace();
                return;
            }
        } else {
            try {
                input = CharStreams.fromStream(System.in);
            } catch (IOException e) {
                System.err.println("ERROR: Failed to get input stream.");
                e.printStackTrace();
                return;
            }
        }

        JLexer lexer = new JLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);

        JParser parser = new JParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        JDefListener def = new JDefListener();
        walker.walk(def, tree);
        
        JRunVisitor visitor = new JRunVisitor(def.getFunctions());
        visitor.visit(tree);
    }
}
