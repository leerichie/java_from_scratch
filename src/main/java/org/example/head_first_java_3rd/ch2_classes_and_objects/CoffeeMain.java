package org.example.head_first_java_3rd.ch2_classes_and_objects;

public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.name = "Jura";
        machine.colour = "Black";
        machine.isLoud = true;
        machine.milkFrother = true;
        machine.selfClean = true;
        machine.price = 5000;
        machine.refillCoffee();
        machine.refillWater();

        System.out.println(machine);
    }
}
