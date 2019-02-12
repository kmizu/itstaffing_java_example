package com.github.kmizu.itstaffing_java_example;

import java.util.*;
public class BeforeGenerics {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(Integer.valueOf(1));
        numbers.add(Integer.valueOf(2));
        int first = ((Integer)numbers.get(0)).intValue();
    }
}
