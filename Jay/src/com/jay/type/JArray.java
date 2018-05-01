package com.jay.type;

import java.util.Arrays;

public class JArray extends JValue {
    /**
     * The maximum size of array to allocate. Some VMs reserve some header words
     * in an array. Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private JType elementType;

    public JArray(JType type) {
        this(type, 0);
    }

    public JArray(JType type, int capacity) {
        this.value = new JValue[capacity];
        this.type = JType.ARRAY;

        elementType = type;
    }

    @Override
    public JValue add(JValue value) {
        return null;
    }

    @Override
    public JValue divide(JValue value) {
        return null;
    }

    @Override
    public JValue multiply(JValue value) {
        return null;
    }

    @Override
    public JValue subtract(JValue value) {
        return null;
    }

    @Override
    public JValue[] getValue() {
        return (JValue[]) value;
    }

    public void set(int index, JValue value) {
        if (elementType != JType.NIL && elementType != value.getType()) {
            throw new UnsupportedOperationException("Wrong type for Array");
        }

        ensureCapacity(index + 1);
        if (index == -1) {
            int size = ((JValue[]) this.getValue()).length;
            index += size + 1;
        }

        ((JValue[]) this.getValue())[index] = value;
    }

    public JValue get(int index) {
        if (index < 0) {
            index = length() + index;
        }
        return ((JValue[]) getValue())[index];
    }

    public JType getElementType() {
        return elementType;
    }

    @Override
    public JArray copy() {
        JArray v = new JArray(null);
        v.dynamic = dynamic;
        v.type = type;
        v.value = this.value;
        return v;
    }

    /**
     * @see java.util.ArrayList#ensureExplicitCapacity(int minCapacity)
     * @param minCapacity
     */
    private void ensureCapacity(int minCapacity) {
        JValue[] elementData = (JValue[]) getValue();

        // overflow-conscious code
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        JValue[] elementData = (JValue[]) getValue();
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        this.value = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    public int length() {
        return ((JValue[]) getValue()).length;
    }
}
