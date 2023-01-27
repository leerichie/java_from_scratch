package org.example.sda_materials.tests;

import org.example.sda_materials.Greetings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class GreetingsTest {

    @Test
    void whenCallingSayHello_thenReturnHello() {
        Assertions.assertEquals("Hello", Greetings.sayHello());
    }
}