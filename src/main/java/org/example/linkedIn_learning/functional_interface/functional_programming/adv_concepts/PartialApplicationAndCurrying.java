package org.example.linkedIn_learning.functional_interface.functional_programming.adv_concepts;

import org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions.TriFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartialApplicationAndCurrying {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> add =
                (x, y, z) -> x + y + z;


        // alter amount of <T> funct/BiFunc
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                (x) -> (y, z) -> add.apply(x, y, x);

        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);
        System.out.println(add5.apply(6, 7));

        // currying - 1 at a time:  (x) -> (y) -> (z)


        // alter amount of <T> funct/BiFunc
        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial1 =
                (x, y) -> (z) -> add.apply(x, y, x);

        Function<Integer, Integer> add5And6 = addPartial1.apply(5, 6);
        System.out.println(add5And6.apply(7));


    }
}