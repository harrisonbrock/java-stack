package com.harrisonbrock;

public class Main {

    public static void main(String[] args) {

        Stack stack = new StackImpl();
        System.out.println(stack.size());

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack.size());

        stack.print();
        stack.pop();
        System.out.println("\n");
        stack.print();
        System.out.println("\n");
        stack.pop();
        stack.print();
        System.out.println("\n");
        stack.pop();
        stack.print();
        System.out.println(stack.size());

    }
}
