package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator {
    @Test
    void checkException(){
        assertThrows(IllegalArgumentException.class, () ->
                divide(10, 0), "divider can't be null");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(10, 10);
        int subtract = calculator.subtract(20, 10);
        int multiply = calculator.multiply(10, 10);
        int divide = calculator.divide(100, 10);
        int remainder = calculator.remainder(10, 20);
        System.out.println("Add method result: " + add);
        System.out.println("Subtract method result: " + subtract);
        System.out.println("Multiply method result: " + multiply);
        System.out.println("Divide method result: " + divide);
        System.out.println("Remainder method result: " + remainder);

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int remainder(int a, int b){return a % b;
    }
}
