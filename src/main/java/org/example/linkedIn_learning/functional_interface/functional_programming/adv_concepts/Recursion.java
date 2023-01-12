package org.example.linkedIn_learning.functional_interface.functional_programming.adv_concepts;

public class Recursion {

    static void countdown(Integer x){
        if (x < 0){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countdown(x -1);
    }

    static void countUp (Integer x, Integer end){
        if (x > end){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x +1, end);
    }

    public static void main(String[] args) {
//        countdown(10);
        countUp(0, 10);


    }
}
