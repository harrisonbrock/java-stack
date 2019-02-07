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
    public String size() {
        if (top < 0) {
            return "You have not items in your Stack";
        }
        else {
            return Integer.toString(top+1);
        }
    }

    @Override
    public String pop() {
        if (top < 0) {
            return "Your Stack Is Empty";
        }
        else {
            String str = stack[top];
            stack[top] = null;
            top--;
            return str;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
        }
        else {
            for (String str : stack) {
                if (str == null) break;
                System.out.print(str + " ");
            }
        }

    }
}
