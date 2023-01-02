package org.example.linkedIn_learning.inheritance;

import org.example.linkedIn_learning.inheritance.enums.Currency;
import org.example.linkedIn_learning.inheritance.enums.LanguageSpoken;
import org.example.linkedIn_learning.inheritance.enums.Nationality;
import org.example.linkedIn_learning.inheritance.enums.Subject;

public class Teacher extends Employee{
    private Subject subject;

    public Teacher(String name, int age, Nationality nationality, LanguageSpoken languageSpoken, int salary, Currency currency, Subject subject) {
        super(name, age, nationality, languageSpoken, salary, currency);
        this.subject = subject;
    }

    public void getBonus(){
        if (salary > 0.0) {
            System.out.println("inc. bonus of 10%: " + getCurrency() + " " + (salary * 0.10));
            System.out.println("TOTAL: " + getCurrency() + " " + (salary + salary * 0.10));
        }
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
