package org.example;

import java.util.Optional;

public class Java8OptionalExample {
    public static void main(String[] args) {

        Optional<String> data = getValue(null);
        System.out.println(data.orElse("no value"));
    }

    // getValue method returning Optional<String>
    public static Optional<String> getValue(String input) {
        //return Optional.ofNullable(input); // Returns Optional.empty() if input is null, else returns Optional with value
        // Convert empty string to Optional.empty()
        return (input == null || input.isEmpty()) ? Optional.empty() : Optional.of(input);
    }

}
