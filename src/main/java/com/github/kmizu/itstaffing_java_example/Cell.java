package com.github.kmizu.itstaffing_java_example;

public class Cell<T> {
    public T value;
    public Cell(T value) {
        this.value = value;
    }
    public <U> Cell<U> swap(U newValue) {
        return new Cell<>(newValue);
    }
}
