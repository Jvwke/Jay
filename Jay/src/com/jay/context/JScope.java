package com.jay.context;

import java.util.HashMap;
import java.util.Map;

import com.jay.exception.JException;
import com.jay.type.JArray;
import com.jay.type.JType;
import com.jay.type.JValue;

public class JScope {
    private JScope parent;
    private Map<String, JValue> variables;
    private JType declaredType;

    public JScope() {
        this(null);
    }

    public JScope(JScope parent) {
        this.parent = parent;

        variables = new HashMap<>();
    }

    public boolean isGlobal() {
        return parent == null;
    }

    /**
     * Check whether variable defined in current scope or it's parent
     * 
     * @param id
     * @return
     */
    public boolean hasVariable(String id) {
        if (variables.containsKey(id)) {
            return true;
        }
        if (!isGlobal()) {
            return parent.hasVariable(id);
        }

        return false;
    }

    public void assignVariable(String id, JValue value) {
        if (variables.containsKey(id)) {
            JValue var = variables.get(id);
            if (var != null && !var.isDynamic() && var.getType() != value.getType()) {
                throw JException.variableIsNotDynamic(id);
            }
            variables.replace(id, var, value);
        } else if (!isGlobal()) {
            parent.assignVariable(id, value);
        } else {
            throw JException.variableDoesNotExist(id);
        }
    }

    public void assignVariableInArray(int index, String id, JValue value) {
        if (variables.containsKey(id)) {
            JValue var = variables.get(id);
            if (var != null && var instanceof JArray) {
                JArray arr = (JArray) var;
                JType type = arr.getElementType();

                if (type != JType.NIL && type != value.getType()) {
                    throw new UnsupportedOperationException();
                }

                arr.set(index, value);
            }
        } else if (!isGlobal()) {
            parent.assignVariableInArray(index, id, value);
        } else {
            throw JException.variableDoesNotExist(id);
        }
    }

    public void declareVariable(String id, JValue value) {
        JValue var = value; // .copy();
        var.setDynamic(declaredType == JType.NIL);

        if (!value.isDynamic() && value.getType() != declaredType && value.getType() != JType.ARRAY) {
            throw JException.variableIsNotDynamic(id);
        }

        if (!variables.containsKey(id)) {
            variables.put(id, var);
        } else {
            throw JException.variableAlreadyExists(id);
        }
    }

    public void setDeclaredType(JType type) {
        declaredType = type;
    }

    public JScope copy() {
        JScope scope = new JScope(parent);
        scope.variables = new HashMap<>(variables);

        return scope;
    }

    public JScope getParent() {
        return parent;
    }

    public JValue getValueInArray(int index, String id) {
        JValue var = variables.get(id);

        if (var != null) {
            if (var instanceof JArray)
                return ((JArray) var).get(index);

            throw new UnsupportedOperationException();
        }

        else if (!isGlobal())
            return parent.getValueInArray(index, id);

        throw JException.variableDoesNotExist(id);
    }

    public JValue getVariable(String id) {
        JValue value = variables.get(id);

        if (value != null) {
            return value;
        } else if (!isGlobal()) {
            return parent.getVariable(id);
        }

        throw JException.variableDoesNotExist(id);
    }

    public JType getDeclaredType() {
        return declaredType;
    }
}
