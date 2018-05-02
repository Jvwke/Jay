package com.jay;

import java.io.IOException;
import java.util.Map;

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
import com.jay.type.JFunction;

public class Jay {
    public static void main(String[] args) {
        if (args.length > 0) {
            runProgram(args[0]);
        } else {
            CharStream input = null;
            try {
                input = CharStreams.fromStream(System.in);
            } catch (IOException e) {
                System.err.println("ERROR: Failed to get input stream.");
                e.printStackTrace();
                return;
            }

            runProgram(input);
        }
    }

    public static Map<String, JFunction> runProgram(String fileName) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            System.err.printf("ERROR: Failed to load %s\n.", fileName);
            e.printStackTrace();
            return null;
        }

        return runProgram(input);
    }

    public static Map<String, JFunction> runProgram(CharStream input) {
        JLexer lexer = new JLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);

        JParser parser = new JParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();

        // scan whole file to find all declared functions
        ParseTreeWalker walker = new ParseTreeWalker();
        JDefListener def = new JDefListener();
        walker.walk(def, tree);

        // run the program
        JRunVisitor run = new JRunVisitor(def.getFunctions());
        run.visit(tree);

        return def.getFunctions();
    }
    
    public static Map<String, JFunction> loadProgram(String fileName) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            System.err.printf("ERROR: Failed to load %s\n.", fileName);
            e.printStackTrace();
            return null;
        }

        return loadProgram(input);
    }
    
    public static Map<String, JFunction> loadProgram(CharStream input) {
        JLexer lexer = new JLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);

        JParser parser = new JParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();

        // scan whole file to find all declared functions
        ParseTreeWalker walker = new ParseTreeWalker();
        JDefListener def = new JDefListener();
        walker.walk(def, tree);

        return def.getFunctions();
    }
}
