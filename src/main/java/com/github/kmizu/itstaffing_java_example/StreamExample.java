package com.github.kmizu.itstaffing_java_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 11, 12, 13
        );
        List<String> newNumbers = numbers.stream()
                .map((n) -> Integer.toString(n * 2))
                .collect(Collectors.toList());
        String result = String.join(",", newNumbers);
        System.out.println(result);
    }
}
