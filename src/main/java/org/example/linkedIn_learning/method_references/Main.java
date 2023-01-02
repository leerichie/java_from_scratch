package org.example.linkedIn_learning.method_references;

public class Main {
    public static void main(String[] args) {

        Square s = new Square(4);

        Shapes shapes = (Square square) -> {        // Lambda version 1
            return square.CalculateArea();
        };

        Shapes shapes1 = (Square square) -> square.CalculateArea();    // Lambda version 2

        Shapes shapes2 = Square::CalculateArea;     // Lambda version 3 - method reference


        System.out.println("Area: " + shapes.getArea(s));
        System.out.println("Area: " + shapes1.getArea(s));
        System.out.println("Area: " + shapes2.getArea(s));

    }
}
