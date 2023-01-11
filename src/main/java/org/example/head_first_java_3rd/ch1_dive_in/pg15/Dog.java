package org.example.head_first_java_3rd.ch1_dive_in.pg15;

public class Dog {
    int size;
    String name;

    public Dog(int size, String name){
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
