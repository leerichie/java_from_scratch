package org.example.sda_materials.generics;

import org.example.head_first_java_3rd.ch1_dive_in.pg15.Animal;
import org.example.head_first_java_3rd.ch1_dive_in.pg15.Cat;
import org.example.head_first_java_3rd.ch1_dive_in.pg15.Dog;

public class GenericMethod {
    public static void main(String[] args) {

        shout("DJ", 60);
        shout(32, "Not old :)");
        shout(2.34f, "what?");
        shout(true, "not true");
        shout(new Cat("British shorthair", 4), new Dog("Dalmation", 7));

    }
    private static <T, V> void shout(T thingToShout, V anotherThing){      // method to print any <T> Type
        System.out.println(thingToShout + " -> <T> 1st param "
                + anotherThing + " -> <V> 2nd param");           // can have multi params (T, V)
    }
}
