package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {

        Function<Integer, Integer> absoluteValue =
        (x) -> x < 0 ? -x : x;
//
//        System.out.println(absoluteValue.apply(-7));

//        Function<String, Integer> stringLength =
//                String::length;
//        System.out.println(strLength.apply("hello"));

//        Function<String, Character> findCharInString =
//                (s -> s.charAt(2));
//        System.out.println(myString.apply("HELLO"));

//        Function<String, String> removeStartAndEndWhiteSpaces =
//                String::strip;
//        System.out.println(removeStartAndEndWhiteSpaces.apply("  My name is Lee Bee  "));
    }
}
