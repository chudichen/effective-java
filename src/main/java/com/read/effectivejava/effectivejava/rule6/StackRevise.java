package com.read.effectivejava.effectivejava.rule6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 发生内存溢出
 *
 * @author Michael Chu
 * @date 2019-04-30 09:53
 */
public class StackRevise {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackRevise() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // 将弹出位置的对象置为空，帮助垃圾收集器，从而避免内存溢出。
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
