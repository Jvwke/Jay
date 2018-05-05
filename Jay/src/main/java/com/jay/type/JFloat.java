package com.jay.type;

public class JFloat extends JNumber {
    public JFloat(double value) {
        super(value);
        type = JType.FLOAT;
    }

    public JFloat(String value) {
        this(Double.valueOf(value));
    }

    @Override
    public Double getValue() {
        return (Double) value;
    }

    @Override
    public JFloat copy() {
        JFloat v = new JFloat(0d);
        v.dynamic = dynamic;
        v.type = type;
        v.value = value;
        return v;
    }
}
