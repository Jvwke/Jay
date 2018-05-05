package com.jay.type;

public class JBool extends JValue {
    public JBool(boolean value) {
        this.value = value;
        type = JType.BOOLEAN;
    }

    public JBool(String value) {
        this(Boolean.valueOf(value));
    }

    @Override
    public JValue add(JValue value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JValue divide(JValue value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JValue multiply(JValue value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JValue subtract(JValue value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Boolean getValue() {
        return (Boolean) value;
    }

    @Override
    public JBool copy() {
        JBool v = new JBool(false);
        v.dynamic = dynamic;
        v.type = type;
        v.value = value;
        return v;
    }

}
