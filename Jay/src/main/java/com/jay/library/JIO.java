package com.jay.library;

import java.util.Arrays;

import com.jay.type.JValue;

public class JIO {

    public static JValue native_print(JValue... values) {
        if (values == null || values.length == 0) {
            System.out.print("");
        } else {
            int len = values.length;
            if (len == 1) {
                System.out.print(values[0].toString());
            } else {
                String tpl = values[0].toString();
                for (int i = 1; i < len; i++) {
                    tpl = tpl.replace("{" + (i - 1) + "}", values[i].toString());
                }
                System.out.print(tpl);
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
