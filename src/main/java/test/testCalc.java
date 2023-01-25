package test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCalc {

    @Test
    @DisplayName("+ add")
    void shouldAddNums() {
        final int a = 2;
        final int b = 5;

        Calculator add = new Calculator();

        final int result = add.add(a, b);

        assertEquals(7, result);
    }

    @Test
    @DisplayName("- subtract")
    void shouldSubtractNums() {
        final int a = 2;
        final int b = 5;

        Calculator subtract = new Calculator();

        final int result = subtract.subtract(a, b);

        assertEquals(-3, result);
    }

    @Test
    @DisplayName("* multiply")
    void shouldMultiplyNums(){
        final int a = 10;
        final int b = 7;

        Calculator times = new Calculator();

        final int result = times.multiply(a,b);

        assertEquals(70, result);
    }
}
