package com.jay.type;

import java.util.HashMap;
import java.util.Map;

public enum JType {
    ARRAY("array"), //
    BOOLEAN("bool"), //
    INTEGER("int"), //
    NIL("nil"), //
    OBJECT("object"), //
    FLOAT("float"), //
    STRING("string");

    private static final Map<String, JType> caches = new HashMap<String, JType>();
    static {
        for (JType e : JType.values()) {
            caches.put(e.value, e);
        }
    }
    private String value;

    JType(String value) {
        this.value = value;
    }

    public boolean isCompatible(JType type) {
        switch (this) {
        case INTEGER:
            return type == INTEGER || type == FLOAT;
        case FLOAT:
            return type == INTEGER || type == FLOAT;
        case NIL:
            return type == NIL;
        default:
            return false;
        }
    }

    public static JType find(String value) {
        if (caches.containsKey(value)) {
            return caches.get(value);
        }
        throw new UnsupportedOperationException();
    }
}
