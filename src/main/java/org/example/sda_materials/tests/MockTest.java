package org.example.sda_materials.tests;

import org.example.calculator.Calculator;
import org.example.car.Car;
import org.example.person.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    Person p1 = new Person("Lee", "Richie", Person.Gender.FEMALE, 44, 1);

    @Test
    void shouldReturnSth(){

        assertEquals("Lee", p1.getName());
    }

}
