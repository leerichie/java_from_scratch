package org.example.linkedIn_learning.functional_interface.functional_programming.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsEx {
    public static void main(String[] args) {

        String [] strArray = {"Colloquial", "Redundant", "Redundant", "Tiny", "Homesick", "Nail", "Neverland"};
        List<String> words = new ArrayList<>(Arrays.asList(strArray));

        // Set - unordered & no duplicates

         Predicate<String> containsU = (s) -> s.contains("u");

        Set<String> displayU1 = words
                .stream()
                .filter(containsU)
                .collect(Collectors.toSet());
        System.out.println("Words containing 'u'(Set<> no duplicates): " + displayU1);

        // joining

        String displayU2 = words       // String - no args
                .stream()
                .filter(containsU)
                .collect(Collectors.joining("-(join)-"));
        System.out.println("Words containing 'u'(join str options): " + displayU2);

        // count size

        long countWords = words     // Long - no args
                .size();
        System.out.println("Words in array of strings: " + countWords);

        // group By - Map<Key, List of<Words>>   organise strings by length

        Map<Integer, List<String>> wordLengthMap = words
                .stream()
                .collect(Collectors.groupingBy(
                        word -> word.length()    // OR method ref: String::length
                ));
        System.out.println(wordLengthMap);
    }
}
