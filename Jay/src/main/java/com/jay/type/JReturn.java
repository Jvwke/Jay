package com.jay.type;

public class JReturn extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private JValue returnValue;

    public JReturn(JValue value) {
        returnValue = value;
    }

    public final JValue getReturnValue() {
        return returnValue;
    }
}
