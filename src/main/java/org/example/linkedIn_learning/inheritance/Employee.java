package org.example.linkedIn_learning.inheritance;

import org.example.linkedIn_learning.inheritance.enums.Currency;
import org.example.linkedIn_learning.inheritance.enums.LanguageSpoken;
import org.example.linkedIn_learning.inheritance.enums.Nationality;

public class Employee extends Person{
    protected double salary;
    private Currency currency;

    public Employee(String name, int age, Nationality nationality, LanguageSpoken languageSpoken, int salary, Currency currency) {
        super(name, age, nationality, languageSpoken);
        this.salary = salary;
        this.currency = currency;
    }

    public double getSalary() {
        return salary;
    }

    public Currency getCurrency(){
        return currency;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", salary=" + salary +
                ". currency=" + currency +
                '}';
    }


}
