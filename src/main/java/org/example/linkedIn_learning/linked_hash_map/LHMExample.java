package org.example.linkedIn_learning.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHMExample {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>
                (4, 0.75f, true); // order by when last accessed
        phonebook.put("Lee", 123456);
        phonebook.put("Ani", 654321);
        phonebook.put("Arthur", 121212);
        phonebook.put("Gertrude", 111111);
        System.out.println("Ani's number: " + phonebook.get("Ani"));
        System.out.println("Lee's number: " + phonebook.get("Lee"));

        System.out.println("\nList of Phone Contacts:");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
