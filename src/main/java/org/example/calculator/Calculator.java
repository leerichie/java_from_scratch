package org.example.calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 10);
        System.out.println("Add method result: " + sum);
    }

    public int add(int a, int b) {
        return a + b;
    }
}
