package org.example.linkedIn_learning.functional_interface.functional_programming.first_class_functions;

public class FunctionsAsData {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::loadPersonFake
                    : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println("Loading person...");
            return new Person("Real Person", 24);
        }

        private Person loadPersonFake() {
            System.out.println("Returning fake person object");
            return new Person("Fake Person", 45);
        }
    }

    public static void main(String[] args) {
        final boolean IS_DEVELOPMENT = false;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
