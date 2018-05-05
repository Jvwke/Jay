package com.jay.library;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import com.jay.Jay;
import com.jay.context.JDef;
import com.jay.type.JFunction;
import com.jay.type.JValue;

public class JLibrary {

    public static Map<String, JFunction> FUNCTIONS = new ConcurrentHashMap<>();
    public static Map<String, Method> NATIVE_FUNCTIONS = new HashMap<String, Method>();
    static {
        init();
    }
    
    private static void init() {
        // load core library
        CharStream input;
        try {
            String fileName = "core.jay";
            InputStream in = JLibrary.class.getResourceAsStream("/" + fileName);
            if(in == null) {
                System.err.println("Core library of core.jay is not found.");
               return;
            }
            input = CharStreams.fromStream(in);
            JDef def = Jay.runProgram(fileName, input);
            FUNCTIONS.putAll(def.getFunctions());
        } catch (IOException e) {
            System.err.println("Error raised when load core library of core.jay.");
            e.printStackTrace();
        }
        
        // load native function
        Method[] methods = JLibrary.class.getDeclaredMethods();
        
        for (Method method : methods) {
            if(!method.getName().startsWith("native_")) {
                continue;
            }
            NATIVE_FUNCTIONS.put(method.getName().substring(7), method);
        }
    }
    
    public static JValue native_print(JValue... values) {
        if(values == null || values.length == 0) {
            System.out.print("");
        } else {
            int len = values.length;
            for(int i = 0; i< len;i++) {
                System.out.print(values[i].toString());
                if(len > 1 && i < len -1) {
                    System.out.print(", ");
                }
            }
        }
        return null;
    }
    
    public static JValue native_println(JValue... values) {
        native_print(values);
        System.out.println();
        return null;
    }
}
