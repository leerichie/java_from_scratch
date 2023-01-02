package org.example.linkedIn_learning.oop_1;

import java.util.List;

public class UnitedNations {
    public static void main(String[] args) {

//        new Country().dance();
//        new Ireland().dance();
//        new Scotland().dance();
//        new England().dance();

        Country country = new Country();
        England england = new England();
        Scotland scotland = new Scotland();
        Ireland ireland = new Ireland();

        List<Country> countries = List.of(england, scotland, ireland);
        for (Country country1 : countries) {
            country1.dance();
        }
    }
}