package com.jay.exception;

public class JException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private JException() {
    }

    private JException(String message) {
        super(message);
    }

    public static JException idsDoNotMatch(String bId, String eId) {
        return new JException("ERROR: Begin ID '" + bId + "' does not match end ID '" + eId + "'.");
    }

    public static JException variableAlreadyExists(String id) {
        return new JException("ERROR: Variable '" + id + "' has already been declared.");
    }

    public static JException variableDoesNotExist(String id) {
        return new JException("ERROR: Variable '" + id + "' has not been declared.");
    }

    public static JException variableIsNotArray(String id) {
        return new JException("ERROR: Variable '" + id + "' is not an array.");
    }

    public static JException variableIsNotDynamic(String id) {
        return new JException("ERROR: Variable '" + id + "' is a static variable, not allowed to reassign type.");
    }
}
