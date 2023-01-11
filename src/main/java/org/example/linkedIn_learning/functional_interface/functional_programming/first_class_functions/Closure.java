package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

import java.util.function.Function;

public class Closure {
    public static void main(String[] args) {

        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Lee";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}