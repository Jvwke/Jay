package com.jay.type;

public abstract class JNumber extends JValue {
    protected JNumber(Number value) {
        this.value = value;
    }

    @Override
    public final JValue add(JValue v) {
        if (isAllowCalculation(this, v)) {
            Number n1 = (Number) this.getValue(), n2 = (Number) v.getValue();

            if (this instanceof JFloat || v instanceof JFloat) {
                return new JFloat(n1.doubleValue() + n2.doubleValue());
            }
            return new JInteger(n1.intValue() + n2.intValue());
        }

        throw new UnsupportedOperationException();
    }

    @Override
    public final JValue divide(JValue v) {
        if (isAllowCalculation(this, v)) {
            Number n1 = (Number) this.getValue(), n2 = (Number) v.getValue();

            if (this instanceof JFloat || v instanceof JFloat) {
                return new JFloat(n1.doubleValue() / n2.doubleValue());
            }
            return new JInteger(n1.intValue() / n2.intValue());
        }

        throw new UnsupportedOperationException();
    }

    @Override
    public final JValue multiply(JValue v) {
        if (isAllowCalculation(this, v)) {
            Number n1 = (Number) this.getValue(), n2 = (Number) v.getValue();

            if (this instanceof JFloat || v instanceof JFloat) {
                return new JFloat(n1.doubleValue() * n2.doubleValue());
            }
            return new JInteger(n1.intValue() * n2.intValue());
        }

        throw new UnsupportedOperationException();
    }

    @Override
    public final JValue subtract(JValue v) {
        if (isAllowCalculation(this, v)) {
            Number n1 = (Number) this.getValue(), n2 = (Number) v.getValue();

            if (this instanceof JFloat || v instanceof JFloat) {
                return new JFloat(n1.doubleValue() - n2.doubleValue());
            }
            return new JInteger(n1.intValue() - n2.intValue());
        }

        throw new UnsupportedOperationException();
    }

}
