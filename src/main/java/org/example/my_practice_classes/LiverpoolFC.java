package org.example.my_practice_classes;

public class LiverpoolFC {
    public String name;
    public String position;
    public int skillLevel;

    public LiverpoolFC(String name, String position, int skillLevel) {
        this.name = name;
        this.position = position;
        this.skillLevel = skillLevel;
    }

    public LiverpoolFC() {
    }

    @Override
    public String toString() {
        return "Liverpool FC: " +
                " Name: " + name +
                ", Position: " + position +
                ", Skill Level: " + skillLevel;
    }
}
