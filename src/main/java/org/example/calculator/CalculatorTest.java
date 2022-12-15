package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void main() {
        assertEquals(4, Calculator.add(2, 2));
        assertEquals(5, Calculator.subtract(10, 5));
    }
}