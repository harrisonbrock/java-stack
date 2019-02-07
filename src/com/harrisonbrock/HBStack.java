package com.harrisonbrock;

public interface HBStack<T> {
    boolean push(T item);
    T pop();
    boolean isEmpty();
    int size();
    void print();
}
