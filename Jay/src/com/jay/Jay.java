package com.jay;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jay.context.JDefPhase;
import com.jay.context.JErrorListener;
import com.jay.context.JRunPhase;
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
    /**
     * Remember all loaded file
     */
    private static Set<String> LOADED_FILES = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
    public static boolean isFileLoaded(String fileName) {
        return LOADED_FILES.contains(fileName);
    }
    
    /**
     * Register that the file will be load
     * @param fileName
     */
    public static void registerFile(String fileName) {
        LOADED_FILES.add(fileName);
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

        return runProgram(fileName, input);
    }

    public static Map<String, JFunction> runProgram(CharStream input) {
        return runProgram("__system_in__", input);
    }
    
    public static Map<String, JFunction> runProgram(String fileName, CharStream input) {
        JDefPhase def = loadProgram(fileName, input);

        // run the program
        JRunPhase run = new JRunPhase(def.getFunctions());
        run.visit(def.getTree());

        return def.getFunctions();
    }
    
    public static JDefPhase loadProgram(String fileName) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            System.err.printf("ERROR: Failed to load %s\n.", fileName);
            e.printStackTrace();
            return null;
        }

        return loadProgram(fileName, input);
    }
    
    public static JDefPhase loadProgram(String fileName, CharStream input) {
        JLexer lexer = new JLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);

        JParser parser = new JParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new JErrorListener());
        ParseTree tree = parser.program();

        // register fileName before really loaded
        Jay.registerFile(fileName);
        // scan whole file to find all declared functions
        JDefPhase def = new JDefPhase(fileName, tree);
        def.visit(tree);

        return def;
    }
}
