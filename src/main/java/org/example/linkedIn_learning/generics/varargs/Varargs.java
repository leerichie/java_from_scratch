package org.example.linkedIn_learning.generics.varargs;

public class Varargs {

    static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i=0; i<items.length; i++){
            System.out.println(i + 1 + ": " + items[i]);
        }
    }

    public static void main(String[] args) {
//        String item1 = "apple";
//        String item2 = "banana";
//        String item3 = "pear";
//        String [] shopping = {"Bread", "Milk", "Eggs", "Butter"};
//        System.out.println(item1);
//        printShoppingList(shopping);
        printShoppingList("Bread", "Milk", "Eggs", "Butter", "Tomatoes");

    }
}
