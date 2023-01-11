package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

public class MyBiFunction {
    public static void main(String[] args) {

//        BiFunction<Integer, Integer, Integer> twoArguments =
//                ((integer, integer2) -> integer * integer2);
//
//        System.out.println("Two arg sum: " + twoArguments.apply(10,10));

//        String name = "name";
//        BiFunction<String, String, String> twoArgString =
//                (s, s2) -> s.substring(2, 4).concat(name).toUpperCase()
//                        + " " + s2.substring(2, 4).concat("wierdo").toUpperCase();
//
//        System.out.println(twoArgString.apply("Massive", "House"));

        TriFunction<Integer, Integer, Integer, Integer> threeArgs =
                ((x, y, z) -> x + y + z);
        System.out.println("Three arg function: " + threeArgs.apply(10,10,10));

        NoArgFunction<String> noArgFunc = () -> "say hello"; // no arg interface
        System.out.println(noArgFunc.apply());      // .apply()
    }
}
