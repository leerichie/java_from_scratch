package org.example.linkedIn_learning.functional_interface.functional_programming.adv_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CompositionString {

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

        public static void main(String[] args) {

            CompositionString.Employee[] employeesArr = {
                    new CompositionString.Employee("John", 34, "developer", 80000f),
                    new CompositionString.Employee("Hannah", 24, "developer", 95000f),
                    new CompositionString.Employee("Bart", 50, "sales executive", 100000f),
                    new CompositionString.Employee("Sophie", 49, "construction worker", 40000f),
                    new CompositionString.Employee("Darren", 38, "writer", 50000f),
                    new CompositionString.Employee("Nancy", 29, "developer", 75000f),
            };

            List<CompositionString.Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

            Function<Employee, String> getName = employee -> employee.name;
            Function<String, String> revers = revStr -> new StringBuilder(revStr).reverse().toString();
            Function<String, String> upperCase = String::toUpperCase;

            Function<Employee, String> getReversedUpperCasedName = getName.andThen(revers).andThen(upperCase);

            List<String> results = employees
                    .stream()
                    .map(getReversedUpperCasedName)
                    .toList();
            System.out.println(results);
        }
    }
}