package org.example.head_first_java_3rd.ch2_classes_and_objects;

public class CoffeeMachine {
    public String name;
    public String colour;
    public boolean milkFrother = false;
    public boolean selfClean = false;
    public boolean isLoud = false;
    public int price;

    void refillWater (){
        System.out.println("Refill water tank");
    }
    void refillCoffee(){
        System.out.println("Refill Coffee beans");
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", milkFrother=" + milkFrother +
                ", selfClean=" + selfClean +
                ", isLoud=" + isLoud +
                ", price=" + price + " PLN" +
                '}';
    }
}
