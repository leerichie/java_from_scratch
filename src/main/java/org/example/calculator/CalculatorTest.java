package org.example.calculator;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.calculator.Calculator.divide;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp(){
        System.out.println("Prints before running test");
    }

//    @Test
//    @DisplayName("test for calc")
//    void main() {
//        final double firstNum = 2;
//        final double secNum = 5;
//
//        final double multiResult = firstNum * secNum;
//
//        assertEquals(10, multiResult);

//        assertEquals(4, Calculator.add(2, 2));
//        assertEquals(5, Calculator.subtract(10, 5));

    @Test
    @DisplayName("test me...")
    void main(){
        final int a = 10;
        final int b = 20;
        Calculator testCalc = new Calculator();
        final int result = testCalc.add(a,b);
        assertEquals(30, result);

    }
    @AfterEach
    void after(){
        System.out.println("Prints after test");
    }

    @Test
    void checkException(){
        assertThrows(ArithmeticException.class, () ->
                divide(10, 1), "divider can't be null");
    }

}