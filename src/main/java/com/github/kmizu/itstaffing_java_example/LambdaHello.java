package com.github.kmizu.itstaffing_java_example;

public class LambdaHello {
    public static void main(String[] args) {
        Runnable hello1 = () -> { System.out.println("Hello, World!"); };
        hello1.run();
        Runnable hello2 = new Runnable () {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        };
        hello2.run();
    }
}
