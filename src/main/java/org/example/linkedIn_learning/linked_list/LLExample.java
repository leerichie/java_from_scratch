package org.example.linkedIn_learning.linked_list;

import java.util.LinkedList;

public class LLExample {
    public static void main(String[] args) {

        LinkedList newList = new LinkedList<>();    // type not specified - mix data types
        newList.add("A");   // string
        newList.add(5);     // int
        newList.add('c');   // char
        System.out.println(newList);

        LinkedList<String> newListStrings = new LinkedList<>();    // specified <String>
        newListStrings.add("A");
        newListStrings.add("B");
        newListStrings.add(1, "C");
        System.out.println(newListStrings);
        newListStrings.remove("A");
        System.out.println(newListStrings);
    }
}
