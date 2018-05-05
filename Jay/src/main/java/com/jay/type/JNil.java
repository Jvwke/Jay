package com.jay.type;

public class JNil extends JValue {

    public static final JNil ME = new JNil();

    public JNil() {
        this.value = "nil";
        this.type = JType.NIL;
    }

    public JNil(JType type) {
        this.value = "nil";
        this.type = type != null ? type : JType.NIL;
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
    public Object getValue() {
        return null;
    }

    @Override
    public JNil copy() {
        return this;
    }
}
