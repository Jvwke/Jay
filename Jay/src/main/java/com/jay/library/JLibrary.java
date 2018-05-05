package com.jay.library;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import com.jay.Jay;
import com.jay.context.JDef;
import com.jay.type.JFunction;

public class JLibrary {

    public static Map<String, JFunction> FUNCTIONS = new ConcurrentHashMap<>();
    public static Map<String, Method> NATIVE_FUNCTIONS = new ConcurrentHashMap<String, Method>();

    static {
        String fileName = "io.jay";
        // load core library
        InputStream in = JLibrary.class.getResourceAsStream("/" + fileName);
        loadLibrary(fileName, in);

        // load native function
        loadNativeFunctions(JIO.class);
    }

    public static void loadCoreLibrary() {
        // to invoke static code block
    }

    public static void loadLibrary(String fileName, InputStream in) {
        try {
            if (in == null) {
                System.err.println(String.format("Library of %s is not found.", fileName));
                return;
            }
            CharStream input = CharStreams.fromStream(in);
            JDef def = Jay.runProgram(fileName, input);
            FUNCTIONS.putAll(def.getFunctions());
        } catch (IOException e) {
            System.err.println(String.format("Error raised when load library of %s.", fileName));
            e.printStackTrace();
        }
    }

    public static void loadNativeFunctions(Class<?> claze) {
        Method[] methods = claze.getDeclaredMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("native_")) {
                continue;
            }
            NATIVE_FUNCTIONS.put(method.getName().substring(7), method);
        }
    }

}
