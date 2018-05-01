package com.jay;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

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
        JRunVisitor visitor = new JRunVisitor();

        visitor.visit(parser.program());
    }
}
