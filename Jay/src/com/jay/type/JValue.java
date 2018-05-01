package com.jay.type;

import java.util.Arrays;

public abstract class JValue {
    protected boolean dynamic = true;

    protected Object value;
    protected JType type;

    public static final boolean isAllowCalculation(JValue v1, JValue v2) {
        return v1 instanceof JNumber && v2 instanceof JNumber;
    }

    public final static JBool compare(JValue v1, JValue v2, JCompare op) {
        if (isAllowCalculation(v1, v2)) {
            float n1 = ((Number) v1.value).floatValue(), n2 = ((Number) v2.value).floatValue();

            switch (op) {
            case LT:
                return new JBool(n1 < n2);
            case LE:
                return new JBool(n1 <= n2);
            case GT:
                return new JBool(n1 > n2);
            case GE:
                return new JBool(n1 >= n2);
            case EQ:
                return new JBool(n1 == n2);
            case NE:
                return new JBool(n1 != n2);
            }
        } else if (v1 instanceof JBool && v2 instanceof JBool) {
            Boolean b1 = (Boolean) v1.value, b2 = (Boolean) v2.value;

            switch (op) {
            case EQ:
                return new JBool(b1 == b2);
            case NE:
                return new JBool(b1 != b2);
            default:
                throw new UnsupportedOperationException();
            }
        }

        throw new UnsupportedOperationException();
    }

    public abstract JValue add(JValue value);

    public abstract JValue divide(JValue value);

    public abstract JValue multiply(JValue value);

    public static JValue not(JValue value) {
        if (value instanceof JBool) {
            JBool b = (JBool) value;
            return new JBool(!b.getValue());
        }

        throw new UnsupportedOperationException();
    }

    public abstract JValue subtract(JValue value);

    public abstract JValue copy();

    public abstract Object getValue();

    public final JType getType() {
        return type;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public final boolean isDynamic() {
        return dynamic;
    }

    public String toString() {
        return this instanceof JArray ? Arrays.toString((JValue[]) value) : value.toString();
    }
}
