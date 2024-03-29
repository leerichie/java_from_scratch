package org.example.head_first_java_3rd.ch1_dive_in.pg15;

public class Dog extends Animal{
    String breed;
    int size;

    public Dog() {
    }

    public Dog(String name, int size){
        this.breed = name;
        this.size = size;
    }
    public void woof(){
        System.out.println("Woof");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", hasFur=" + hasFur +
                ", speed=" + speed +
                '}';
    }
}
