package org.example.linkedIn_learning.functional_interface.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {

        // String Array filtering

        String [] strArray = {"Colloquial", "Redundant", "Redundant", "Tiny", "Homesick", "Nail", "Neverland"};
        List<String> words = new ArrayList<>(Arrays.asList(strArray));

//        Predicate<String> isLessThan5 = (s) -> s.length() < 5;       // Predicate for <R>-return boolean

        Function<Integer, Predicate<String>> letterCountFunc =
                (letterLength) -> (s) -> s.length() > letterLength;

        Predicate<String> longerThan8 = letterCountFunc.apply(8);
        Predicate<String> lessThan5 = letterCountFunc.apply(2);

        List<String> displayLetterCountFilter = words
                .stream()
                .filter(longerThan8)
                .toList();
        System.out.println("More thank 8: " + displayLetterCountFilter);

        List<String> longWords = words
                .stream()
                .filter(lessThan5)
                .toList();
        System.out.println("Less than 2: " + longWords);

        Predicate<String> containsU = (s) -> s.contains("u");

        List<String> displayU = words
                .stream()
                .filter(containsU)
                .toList();
        System.out.println("Words containing 'u': " + displayU);

    }
}
