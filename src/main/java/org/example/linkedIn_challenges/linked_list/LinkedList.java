package org.example.linkedIn_challenges.linked_list;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList newList = new java.util.LinkedList<>();    // type not specified - mix data types
        newList.add("A");   // string
        newList.add(5);     // int
        newList.add('c');   // char
        System.out.println(newList);

        java.util.LinkedList<String> newListStrings = new java.util.LinkedList<>();    // specified <String>
        newListStrings.add("A");
        newListStrings.add("B");
        newListStrings.add(1, "C");
        System.out.println(newListStrings);
        newListStrings.remove("A");
        System.out.println(newListStrings);
    }
}
