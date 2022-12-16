package org.example.linkedIn_challenges.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsExamples {

    static Character[] charArray = {'a', 'h', 'z', 'e', 'r', 'y', 'b'};
    static Integer[] intArray = {50, 22, 73, 11, 97, 35, 99};
    static Boolean[] boolArray = {true, false, true, true, false, true, true};

//    public static List arrayToList(Object[] array, List<Object> list) {       // non-generic (mix types)
    public static <T> List <T> arrayToList(T[] array, List<T> list) {       // generic (set types)
        for (T object : array) {
            list.add(object);
        }
        return list;
    }


    public static void main(String[] args) {

        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        System.out.println(charList);
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(intList);
        List<Boolean> booList = arrayToList(boolArray, new ArrayList<>());
        System.out.println(booList);


        Arrays.sort(charArray, 0, 7);
        System.out.print("Sorted CHAR list: ");
        for(char sorted : charArray){
            System.out.print(sorted);
        }
        System.out.println();


        List names = new ArrayList<>();     // non-generic (can add ANY type to list - String & int)
        names.add("Lee");       // String
        names.add(35);      // int
        String name = (String) names.get(0);
        int age = (int) names.get(1);
        System.out.println("First name: " + name);
        System.out.println("Age: " + age);

        List<String> namesGeneric = new ArrayList<>();      // generic (only one SET type - String)
        namesGeneric.add("Ash");        // String
        namesGeneric.add("Richie");     // String
        namesGeneric.add("Tom");    // copy
        namesGeneric.add("Tom");    // copy
        System.out.println(namesGeneric.get(0));
        System.out.println(namesGeneric.get(1));
        namesGeneric.add(1, "Jesi");
        System.out.println(namesGeneric.get(1));
        System.out.println(namesGeneric.contains("Jesi"));
        int count = 1;
        for (String s :
                namesGeneric) {
            System.out.println(count++ + ": Name: " + s);
        }
        System.out.println(namesGeneric.stream().distinct().collect(Collectors.joining()));


    }
}
