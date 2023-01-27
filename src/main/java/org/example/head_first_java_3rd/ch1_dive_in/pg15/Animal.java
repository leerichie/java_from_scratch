package org.example.head_first_java_3rd.ch1_dive_in.pg15;

import lombok.Data;

@Data
public class Animal {
    String name;
    boolean hasFur;
    int speed;

    public Animal(String name, boolean hasFur, int speed) {
        this.name = name;
        this.hasFur = hasFur;
        this.speed = speed;
    }

    public Animal() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breed = "British";
        cat.name = "King";
        cat.size = 23;
        cat.speed = 8;
        cat.hasFur = true;
        cat.meow();

        Dog dog = new Dog();
        dog.breed = "Dalmation";
        dog.name = "Swift";
        dog.size = 44;
        dog.speed = 7;
        dog.hasFur = true;
        dog.woof();

        System.out.println(cat);
        System.out.println(dog);


    }
}
