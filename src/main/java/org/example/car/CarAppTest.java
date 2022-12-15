package org.example.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarAppTest {

    @Test
    void CarAppTest() throws Exception {
        Car vw = new Car("Passat", 2000, "Blue", true, 230000);
        assertEquals("Passat", vw.getModel());
        assertEquals(2000, vw.getProductionYear());
        assertEquals("Blue", vw.getColour());
        assertTrue(vw.isUsed());
        assertEquals(230000, vw.getMileage());
    }

}