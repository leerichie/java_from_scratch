package org.example.linkedIn_learning.functional_interface.functional_programming.streams;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter3Challenge1 {
    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        // Answer 1 goes here - list of NAMES ONLY

        List<String> listNames = people
                .stream()
                .map(person -> person.name)
                .toList();
        System.out.println(listNames);


        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Answer 2 goes here - list of BLUE cars

        List<Car> blueCars = cars
                .stream()
                .filter(car -> car.color.equals("blue"))
//                .map(s -> s.toString())
                .collect(Collectors.toList());  // @Override toString in Car class added
        System.out.println(blueCars);


        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        // Answer 3 goes here - SUM of all salaries

        BinaryOperator<Float> getAllSalaries = (acc, x) -> {    // makes list(shows process)
            Float result = acc + x;
            System.out.println("acc: " + acc + ", x: " + x + ", result: " + result);
            return result;
        };

        Float sumOfSalaries = employees     // sums up
                .stream()
                .map((employee) -> employee.salary)
                .reduce(0f, Float::sum);
//        .reduce(0f, getAllSalaries); // using BinaryOperator to show process
        System.out.println("Sum of all salaries: " + sumOfSalaries);


        Float totalDeveloperSalaries = employees
                .stream()
                .filter(employee -> employee.jobTitle.equals("developer"))
                .map(developer -> developer.salary)
                .reduce(0f, Float::sum);

        Long numberOfDevelopers = employees
                .stream()
                .filter(employee -> employee.jobTitle.equals("developer"))
                .count();

        Float averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;
        System.out.println("Average DEV salary: " + averageDeveloperSalary);
    }
}
