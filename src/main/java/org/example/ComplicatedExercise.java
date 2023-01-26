package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComplicatedExercise {

    @ParameterizedTest
    @ValueSource(strings = "main")
    void checkPersonName(String word){
        assertNotNull(word);
    }

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
        List<String> removeDuplicates = people.stream()
                .map(Person::getCars)
                .map(o -> o.orElse(List.of()))
                .flatMap(Cars -> Cars.stream())
                .distinct()
                .toList();
        System.out.println(removeDuplicates);
    }
}
