package org.example.linkedIn_learning.booking_system;

import java.util.ArrayList;

public class Hairdresser {
    private String name;
    private ArrayList<String> daysAvailable = new ArrayList<>();

    public Hairdresser() {
    }

    public Hairdresser(String name) {
        this.name = name;
    }

    public void setDaysAvailable(String... days) {
        for (String day : days){
            daysAvailable.add(day);
        }
    }
    public void removeDay(String day){
        if (daysAvailable.contains(day)){
            daysAvailable.remove(day);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getDaysAvailable() {
        return daysAvailable;
    }
}
