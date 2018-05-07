package com.jay.library;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jay.type.JString;
import com.jay.type.JValue;

public class JIO {

    private static final Pattern PARAM_PATTERN = Pattern.compile("\\{(\\d+)\\}");

    public static JValue native_print(JValue... values) {
        if (values == null || values.length == 0) {
            System.out.print("");
        } else {
            int len = values.length;
            if (len == 1) {
                System.out.print(values[0].toString());
            } else {
                String tpl = values[0].toString();
                Matcher m = PARAM_PATTERN.matcher(tpl);
                if (m.find()) {
                    int start = 0, end = 0;
                    while (m.find(start)) {
                        start = m.start();
                        System.out.print(tpl.subSequence(end, start));
                        end = m.end();
                        int index = Integer.valueOf(m.group(1));
                        if(index + 1 < values.length) {
                            System.out.print(values[index + 1].toString());
                        } else {
                            System.out.print(m.group());
                        }
                        start = end;
                    }
                    if(end + 1 < tpl.length()) {
                        System.out.print(tpl.substring(end + 1));
                    }
                } else {
                    System.out.print(tpl);
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
    
    public static void main(String[] args) {
        JValue[] values = new JValue[] {new JString("{0}xxx{1}yy{4}y{2}{3}"), new JString("a"), new JString("b"), new JString("c")};
        JIO.native_print(values);
    }
}
