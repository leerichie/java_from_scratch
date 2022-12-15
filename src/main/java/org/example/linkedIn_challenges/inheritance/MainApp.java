package org.example.linkedIn_challenges.inheritance;

import org.example.linkedIn_challenges.inheritance.enums.*;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("\nPERSON");
        Person person = new Person("Lee", 45, Nationality.BRITISH, LanguageSpoken.ENGLISH);
        System.out.println(person);

        System.out.println("\nEMPLOYEE");
        Employee employee = new Employee(person.getName(), person.getAge(), person.getNationality(), person.getLanguageSpoken(), 4200, Currency.PLN);
        System.out.println(employee.getName());
        System.out.println(employee.getCurrency() + " " + employee.getSalary());

        System.out.println("\nTEACHER");
        Teacher teacher = new Teacher(person.getName(), person.getAge(), person.getNationality(), person.getLanguageSpoken(), 3200, Currency.GBP, Subject.IT);
        System.out.println(teacher.getName());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getCurrency() + " " + teacher.getSalary());

        teacher.getBonus();

        System.out.println("\nPROGRAMMER");
        Programmer programmer = new Programmer(person.getName(), person.getAge(), person.getNationality(), person.getLanguageSpoken(), 1200, Currency.USD, LanguageProgramming.JAVA);
        System.out.println(programmer.getName());
        System.out.println(programmer.getLanguageProgramming());
        System.out.println(programmer.getCurrency() + " " + programmer.getSalary());

        programmer.getBonus();

    }
}
