package org.example.linkedIn_learning.hash_map;

import java.util.HashMap;

public class HMExample {
    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Lee", 123456);
        phonebook.put("Ani", 654321);
        phonebook.put("Arthur", 121212);
        phonebook.put("Gertrude", 111111);
        phonebook.put("Gertrude", 222222);  // overwrites first key - NO duplicates
        phonebook.put(null, 000000);

        if(phonebook.containsKey("Lee")){
            phonebook.remove("Lee");
        }
        System.out.println(phonebook);
    }

}
