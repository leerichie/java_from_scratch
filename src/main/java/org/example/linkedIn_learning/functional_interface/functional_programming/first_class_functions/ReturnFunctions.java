package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

import java.util.function.Function;

public class ReturnFunctions {
    protected static class MyMath{
        public static Integer timesTwo(Integer x){
            return x * 2;
        }
        public static Integer timesThree(Integer x) {
            return x * 3;
        }
        public static Integer timesFour(Integer x) {
            return x * 4;
        }
        public static Function<Integer, Integer> createMultiplier(Integer y){
            return (Integer x) -> x * y;
        }
        public static Function<String, String> createConcat(String x){
            return x::concat;
        }
    }

    public static void main(String[] args) {

        NoArgFunction<NoArgFunction> createGreeter = () -> () -> "Hello functional";
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(5);
        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));

        Function<String, String> createConcat = MyMath.createConcat("Hello... ");
        System.out.println(createConcat.apply("Lee"));
    }
}
