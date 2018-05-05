package com.jay.type;

public class JBreak extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public static final JBreak ME = new JBreak();

    private JBreak() {
    }
}
