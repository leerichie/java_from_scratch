package org.example.sda_materials.class_object_method;

public class Car {
    private String make;
    private int year;
    private String colour;
    private int speed;

    public Car(String make, int year, String colour, int speed) {
        this.make = make;
        this.year = year;
        this.colour = colour;
        this.speed = speed;
        if (speed > 150){
            System.out.println(" - at that speed you're breaking the limit");
        } else if (speed >= 50 && speed <= 150){
            System.out.println(" - ok driving speed");
        } else {
            System.out.println(" - get OFF the damn road u snail!!!");
        }
    }

//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public void setColour(String colour) {
//        this.colour = colour;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//        if (speed > 150){
//            System.out.println(" - at that speed you're breaking the limit");
//        } else if (speed >= 50 && speed <= 150){
//            System.out.println(" - ok driving speed");
//        } else {
//            System.out.println(" - get OFF the damn road u snail!!!");
//        }
//    }

    public void printParams() {
        System.out.printf("The car is %s of year %d and of shade %s ", make, year, colour);
        System.out.println("and your speed is " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("VW", 2018, "red", 210);

//        c1.setMake("VW");
//        c1.setYear(2010);
//        c1.setColour("Red");
//        c1.setSpeed(160);
        c1.printParams();
//        System.out.println(c1.make);
//        System.out.println(c1.year);

//        Car c2 = new Car();
//        c2.make = "Merc";
//        c2.year = 2011;
//        c2.colour = "Green";
//        c2.speed  = 210;
//        c2.printParams();
//
//        Car c3 = new Car();
//        c3.make = "Pug";
//        c3.year = 1985;
//        c3.colour = "Grey";
//        c3.speed = 30;
//        c3.printParams();
    }
}
