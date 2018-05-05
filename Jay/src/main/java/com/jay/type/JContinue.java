package com.jay.type;

public class JContinue extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public static final JContinue ME = new JContinue();

    private JContinue() {
    }
}
