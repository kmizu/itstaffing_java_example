package com.github.kmizu.itstaffing_java_example;

import java.util.ArrayList;
import java.util.List;

public class AfterGenerics {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        int first = numbers.get(0);
    }
}
