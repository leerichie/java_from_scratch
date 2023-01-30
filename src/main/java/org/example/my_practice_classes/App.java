package org.example.my_practice_classes;

import org.mockito.internal.matchers.Null;

import java.util.ArrayList;
import java.util.List;

public class App {
//    private static void addElements(List<String> list) {
//        list.addAll(List.of("3", "4"));
//    }
    static void performAddition(String input) {
        try {
            String[] parts = input.split(" ");
            int numA = Integer.parseInt(parts[0]);
            int numB = Integer.parseInt(parts[1]);
            System.out.println(numA + numB);
        } catch (NullPointerException exp) {
            System.out.println("e1");
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("e2");
        }
    }

    public static void main(String[] args) {

        performAddition("1 2 3");
        performAddition("1");
        performAddition(null);

//        List<String> casualList = new ArrayList<>();
//        casualList.add("1");
//        casualList.add("2");
//
//        final List<String> finalList = casualList;
//        finalList.add("5");
//        finalList.add("6");
//
//        addElements(casualList);
//        finalList.forEach(System.out::println);

//       Person adam = new Person("Adam");
//        Person ewa = new Person("Ewa");
//        if(adam == new Person("Adam")){
//            System.out.println("A");
//        }
//        if(adam.equals(new Person("Adam"))){
//            System.out.println("B");
//        }
//        if (adam.hashCode() != ewa.hashCode()){
//            System.out.println("C");
//        }

    }
}
