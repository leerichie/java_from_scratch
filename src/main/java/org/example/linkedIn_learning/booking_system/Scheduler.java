package org.example.linkedIn_learning.booking_system;

import java.util.ArrayList;
import java.util.HashMap;

public class Scheduler {

    private static HashMap<String, Hairdresser> hairdressers = new HashMap<>();

    public Scheduler(){
        Hairdresser Lee = new Hairdresser("Lee");
        Hairdresser Ania = new Hairdresser("Ania");
        Lee.setDaysAvailable("Monday", "Friday");
        Ania.setDaysAvailable("Wednesday", "Thursday");

        hairdressers.put("Lee", Lee);
        hairdressers.put("Ania", Ania);
    }
    public void bookHaircut(String hairdresserName, String day){
        Hairdresser hairdresser = hairdressers.get(hairdresserName);
        ArrayList<String> days = hairdresser.getDaysAvailable();
        if (days.contains(day)){
            System.out.println("You have booked " + hairdresserName + " on " + day + ".");
        } else {
            System.out.println(hairdresserName + " is not available on " + day + ". " +
                    hairdresserName + " is only available on " + hairdresser.getDaysAvailable());
        }
    }

    public static HashMap<String, Hairdresser> getHairdressers() {
        return hairdressers;
    }
}
