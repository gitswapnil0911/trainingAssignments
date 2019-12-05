package com.jpm.tdd.app;

import com.jpm.tdd.app.exception.EmptyMyStackException;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> data = new LinkedList<>();

    public void push(T element) {
        data.addLast(element);
    }

    public int size() {
        return data.size();
    }

    public T pop() throws EmptyMyStackException {
        if (data.isEmpty())
            throw new EmptyMyStackException("Stack is Empty");
        return data.removeLast();
    }

    public T peek() throws EmptyMyStackException {
        if (data.isEmpty())
            throw new EmptyMyStackException("Stack is Empty");
        return data.getLast();
    }
}
