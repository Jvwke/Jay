package com.jay.type;

public class JString extends JValue {
    @Override
    public String toString() {
        return this.value == null ? "" : this.value.toString();
    }

    public JString(String value) {
        this.value = value;
        type = JType.STRING;
    }

    public JValue add(JValue v) {
        String s1 = this.getValue();

        String s2 = null;
        if (v instanceof JArray) {
            s2 = v.toString();
        } else {
            s2 = v.getValue() == null ? "" : v.getValue().toString();
        }

        return new JString(s1.concat(s2));
    }

    public JValue divide(JValue v) {
        throw new UnsupportedOperationException();
    }

    /**
     * "abc" * 3 = "abcabcabc"
     */
    public JValue multiply(JValue v) {
        if (v instanceof JInteger) {
            String value = getValue();
            if (value.length() == 0) {
                return new JString(value);
            }
            int amount = ((JInteger) v).getValue();
            StringBuilder sb = new StringBuilder(amount * value.length());
            for (int i = 0; i < amount; i++) {
                sb.append(value);
            }
            return new JString(sb.toString());
        }
        throw new UnsupportedOperationException();
    }

    /**
     * "abc" - "b" = "ac"
     */
    public JValue subtract(JValue v) {
        if (v instanceof JString) {
            String s1 = (String) this.getValue(), s2 = (String) v.getValue();

            return new JString(s1.replaceAll(s2, ""));
        }

        throw new UnsupportedOperationException();
    }

    public String getValue() {
        return (String) value;
    }

    @Override
    public JString copy() {
        JString v = new JString(null);
        v.dynamic = dynamic;
        v.type = type;
        v.value = this.value;
        return v;
    }
}
