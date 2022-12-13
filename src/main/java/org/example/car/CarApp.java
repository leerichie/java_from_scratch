package org.example.car;

public class CarApp {
    public static void main(String[] args) {
        Car vw = new Car();
        vw.setModel("Passat");
        vw.setColour("Blue");
        vw.setProductionYear(2000);
//        vw.setUsed(true);
        System.out.println(vw.getModel() + "\n" +
                vw.getColour() + "\n" +
                vw.getProductionYear() + "\n" +
                vw.isUsed() + "\n" +
                vw.getMileage());
        System.out.println(vw.drive(0));
        System.out.println(vw.isUsed());


    }
}
