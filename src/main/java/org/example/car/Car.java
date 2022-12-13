package org.example.car;

public class Car {
    private String model;
    private int productionYear;
    private String colour;
    private boolean used = false;
    private int mileage = 0;

    int drive(int mileage){
        if (mileage > 0){
            used = true;
        }
        return mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", productionYear=" + productionYear +
//                ", colour='" + colour + '\'' +
//                ", used=" + used +
//                '}';
//    }
}
