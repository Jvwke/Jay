package com.jay.type;

import java.util.HashMap;
import java.util.Map;

public enum JCompare {
    LT("<"), //
    LE("<="), //
    GT(">"), //
    GE(">="), //
    EQ("=="), //
    NE("!=");

    private static final Map<String, JCompare> caches = new HashMap<String, JCompare>();
    static {
        for (JCompare e : JCompare.values()) {
            caches.put(e.value, e);
        }
    }
    private String value;

    JCompare(String value) {
        this.value = value;
    }

    public static JCompare find(String value) {
        if (caches.containsKey(value)) {
            return caches.get(value);
        }
        throw new UnsupportedOperationException();
    }
}
