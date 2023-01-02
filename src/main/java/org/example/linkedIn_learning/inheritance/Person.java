package org.example.linkedIn_learning.inheritance;

import org.example.linkedIn_learning.inheritance.enums.LanguageSpoken;
import org.example.linkedIn_learning.inheritance.enums.Nationality;

public class Person {
    private String name;
    private int age;
    private Nationality nationality;
    private LanguageSpoken languageSpoken;

    public Person(String name, int age, Nationality nationality, LanguageSpoken languageSpoken) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.languageSpoken = languageSpoken;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public LanguageSpoken getLanguageSpoken() {
        return languageSpoken;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality=" + nationality +
                ", languageSpoken=" + languageSpoken +
                '}';
    }
}
