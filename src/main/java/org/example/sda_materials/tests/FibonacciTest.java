package org.example.sda_materials.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    public static int getValue(int element) {
        return 0;
    }

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(0, FibonacciTest.getValue(0));
    }
}
