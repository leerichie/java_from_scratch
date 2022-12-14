package org.example.linkedIn_learning.functional_interface.functional_programming.streams;

import org.example.linkedIn_learning.streams.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {

        // Integer Array mapping

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

//        List<Integer> doubles = new ArrayList<>();       // long way round
//        for (int i=0; i<listOfIntegers.size(); i++){
//            Integer result = listOfIntegers.get(i) * 2;
//            doubles.add(result);
//        System.out.println(listOfIntegers);

        Function<Integer, Integer> timesTwo = (x) -> x * 2;     // functional more readable

        List<Integer> doubled = listOfIntegers
                .stream()
                .map(timesTwo)
                .collect(Collectors.toList());

        System.out.println(doubled);

        Predicate<Integer> isEven = e -> e % 2 == 0;
        Predicate<Integer> isOdd = o -> o % 2 != 0;

        List<Integer> displayEven = listOfIntegers
                .stream()
                .filter(isEven)
                .toList();
        System.out.println("Filter even no's: " + displayEven);

        List<Integer> displayOdd = listOfIntegers
                .stream()
                .filter(isOdd)
                .toList();
        System.out.println("Filter odd no's: " + displayOdd);

    }
}