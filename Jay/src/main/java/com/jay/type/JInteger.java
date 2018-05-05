package com.jay.type;

public class JInteger extends JNumber {
    public JInteger(int value) {
        super(value);
        type = JType.INTEGER;
    }

    public JInteger(String value) {
        this(Integer.valueOf(value));
    }

    @Override
    public Integer getValue() {
        return (Integer) value;
    }

    @Override
    public JInteger copy() {
        JInteger v = new JInteger(0);
        v.dynamic = dynamic;
        v.type = type;
        v.value = value;
        return v;
    }
}
