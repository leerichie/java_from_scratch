package org.example.sda_materials.generics;

import org.example.head_first_java_3rd.ch1_dive_in.pg15.Cat;
import org.example.head_first_java_3rd.ch1_dive_in.pg15.Dog;

import java.util.ArrayList;

public class Printer<T> {      // generics - use different types in class <T> Type instead of eg.: Integer/String etc

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public static void main(String[] args) {
        Printer<Integer> intg = new Printer(10);   // declare <T> Integer from Printer
        Printer<String> str = new Printer<>("This is a string GENERIC"); // declare <T> String
        intg.print();
        str.print();

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Dog());

        Cat myCat = (Cat) cats.get(0);
        myCat.meow();
        Dog myDog = (Dog) cats.get(0);
        myDog.woof();

    }
}
