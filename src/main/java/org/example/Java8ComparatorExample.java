package org.example;

import java.util.Arrays;
import java.util.List;

public class Java8ComparatorExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        names.sort((s1, s2) -> s1.compareTo(s2)); // Using lambda expression

        System.out.println(names);
    }
}
