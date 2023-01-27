package org.example.sda_materials;

import java.util.Optional;

public class OptionalExa {
    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("King");

        optionalCat.map(Cat::getAge)
                .orElse(0);
        System.out.println(optionalCat.get().getAge());
//        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 2));
//        System.out.println(myCat.getAge());

//        Cat myCat = findCatByName("King");
//        System.out.println(myCat.getAge());
//        if(myCat != null){
//            System.out.println(myCat.getAge());
//        } else {
//            System.out.println(0);
        }


    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }

    private static class Cat {
        public int age;
        public String name;

        public Cat() {
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
