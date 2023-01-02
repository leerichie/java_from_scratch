package org.example.linkedIn_learning.inheritance;

import org.example.linkedIn_learning.inheritance.enums.Currency;
import org.example.linkedIn_learning.inheritance.enums.LanguageProgramming;
import org.example.linkedIn_learning.inheritance.enums.LanguageSpoken;
import org.example.linkedIn_learning.inheritance.enums.Nationality;

public class Programmer extends Employee{
    private LanguageProgramming languageProgramming;

    public Programmer(String name, int age, Nationality nationality, LanguageSpoken languageSpoken, int salary, Currency currency, LanguageProgramming languageProgramming) {
        super(name, age, nationality, languageSpoken, salary, currency);
        this.languageProgramming = languageProgramming;
    }

        public void getBonus(){
            if (salary > 0.0) {

                System.out.println("inc. bonus of 20%: " + getCurrency() + " " + (salary * 0.20));
                System.out.println("TOTAL: " + getCurrency() + " " + (salary + salary * 0.20));
            }
        }

    public LanguageProgramming getLanguageProgramming() {
        return languageProgramming;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + languageProgramming + '\'' +
                '}';
    }
}
