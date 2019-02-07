package com.harrisonbrock;

public class StackImpl implements Stack {
    private final int CAP = 10000;
    private String[] stack;
    private int top;

    public StackImpl() {
        stack = new String[CAP];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean push(String item) {

        if (top >= (CAP - 1)) {
            return false;
        }
        else {
            stack[++top] = item;
            return true;
        }
    }

    @Override
    public int size() {
        if (top < 0) {
            return 0;
        }
        else {
            return top;
        }
    }

    @Override
    public String pop() {
        if (top < 0) {
            return "Your Stack Is Empty";
        }
        else {
            return stack[top--];
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            for (String str : stack) {
                System.out.println(str);
            }
        }

    }
}