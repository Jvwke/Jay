package com.jay.library;

import com.jay.type.JValue;

public class JIO {

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
