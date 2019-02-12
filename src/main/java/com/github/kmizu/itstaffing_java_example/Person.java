package com.github.kmizu.itstaffing_java_example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // hashCode(), equals(), toString() の定義
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Taro", 23),
                new Person("Jiro", 22),
                new Person("Saburo", 17)
        );
        long count = people.stream()
                .filter((p) -> p.getAge() >= 20)
                .count();
        System.out.println(count); // 2
    }
}
