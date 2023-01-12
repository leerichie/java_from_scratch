package org.example.linkedIn_learning.functional_interface.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ParallelStreams {
    public static void main(String[] args) {

        String[] strArray = {"Colloquial", "Redundant", "Redundant", "Tiny", "Homesick", "Nail", "Neverland"};
        List<String> words = new ArrayList<>(Arrays.asList(strArray));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Upper case to: " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation mark to: " + word);
                    return word + "!";
                })
                .toList();
        System.out.println("ParallelStreams: " + processedWords);


//        List<String> processedWords1 = words
//                .stream()
//                .map(word -> word.toUpperCase())
//                .map(another -> another.concat("...ending"))
//                .toList();
//        System.out.println("ParallelStreams: " + processedWords1);

    }
}
