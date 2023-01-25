package org.example.person;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PersonApp {

    public static void main(String[] args) {

        Person pLee = new Person("Lee", "Richie", Person.Gender.MALE, 64, 123456778);
        Person pAni = new Person("Ani", "Jesi", Person.Gender.FEMALE, 59, 675656565);
        Person personAgeCompare = new Person();
        Person person = new Person();

        System.out.println(pLee + " retired: " + (pLee.hasReachedRetirement()));
        System.out.println(pAni + " retired: " + (pAni.hasReachedRetirement()));

        // male 65 retirement
        pLee.setAge(38);
        System.out.println(pLee + " retired: " + (pLee.hasReachedRetirement()));

        // female 60 retirement
        pAni.setAge(38);
        System.out.println(pAni + " retired: " + (pAni.hasReachedRetirement()));

        // compare AGES
        System.out.println(personAgeCompare.ageDifference(
                pLee.getName(),
                pAni.getName(),
                pLee.getAge(),
                pAni.getAge())
        );

        // time til RETIREMENT
        System.out.println(pLee.yearsLeftTilRetirement());
        System.out.println(pAni.yearsLeftTilRetirement());
    }
}
