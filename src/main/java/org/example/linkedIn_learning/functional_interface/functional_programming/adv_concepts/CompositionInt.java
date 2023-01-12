package org.example.linkedIn_learning.functional_interface.functional_programming.adv_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CompositionInt {
    public static void main(String[] args) {

        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x - 1;

        Function<Integer, Integer> timesThenMinusRev = minusOne.compose(timesTwo); // reverse prder
        Function<Integer, Integer> timesThenMinus = timesTwo.andThen(minusOne); // normal prder
        Function<Integer, Integer> minusThenTimes = minusOne.andThen(timesTwo); // diff calc order

        System.out.println("times then minus(strange order): " + timesThenMinusRev.apply(2));
        System.out.println("times then minus: " + timesThenMinus.apply(2));
        System.out.println("minus then times: " + minusThenTimes.apply(2));
    }
}
