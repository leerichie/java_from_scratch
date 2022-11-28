package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComplicatedExercise {

    private static class Person {
        final String name;
        final Optional<List<String>> cars; // very bad style, don't do that at home

        private Person(String name, List<String> cars) {
            this.name = name;
            this.cars = cars.isEmpty() ? Optional.empty() : Optional.of(cars);
        }

        public String getName() {
            return name;
        }

        public Optional<List<String>> getCars() {
            return cars;
        }
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Adam", List.of("Ford")),
                new Person("Bartek", List.of("Fiat", "Mercedes")),
                new Person("Celina", List.of()),
                new Person("Darek", List.of("Mercedes", "Opel")),
                new Person("Ewa", List.of("Fiat"))
        );

        /*
         * zadanie: wypisz wszystkie samochody, bez duplikatów, posortowane po długości nazwy,
         * a następnie alfabetycznie (porządek leksykalny, thenComparing)
         */
    }
}
