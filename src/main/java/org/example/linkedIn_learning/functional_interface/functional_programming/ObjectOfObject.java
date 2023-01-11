package org.example.linkedIn_learning.functional_interface.functional_programming;

import java.util.function.Function;

public class ObjectOfObject {
    protected static class MyMath{
        public static Integer triple(Integer x){
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println("The result: " + result);
    }
}
