package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

import java.awt.event.AdjustmentEvent;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HIgherOrderFunctions {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;


        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>>
                secondArgIsntZero = (func) -> (x, y) -> {
            if (y == 0f) {
                System.out.println("Error: second arg is zero!");
                return 0f;
            }
            return func.apply(x, y);
        };
        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZero.apply(divide);

        System.out.println(divideSafe.apply(10f,0f));
    }
}