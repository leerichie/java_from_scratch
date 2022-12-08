package org.example.computer;

import java.util.Arrays;

public class Ram {

    private String name;
    private int [] slots;

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", slots=" + Arrays.toString(slots) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getSlots() {
        return slots;
    }

    public void setSlots(int[] slots) {
        this.slots = slots;
    }

    public Ram() {
    }

    public Ram(String name, int[] slots) {
        this.name = name;
        this.slots = slots;
    }
}
