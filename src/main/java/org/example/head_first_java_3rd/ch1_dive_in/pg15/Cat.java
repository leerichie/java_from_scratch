package org.example.head_first_java_3rd.ch1_dive_in.pg15;


public class Cat extends Animal{
    String breed;
    int size;

    public Cat() {
    }

    public Cat(String breed, int size) {
        this.breed = breed;
        this.size = size;
    }
    public void meow(){
        System.out.println("Meow");
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
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", hasFur=" + hasFur +
                ", speed=" + speed +
                '}';
    }
}