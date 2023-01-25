package test;

import org.example.person.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPerson {

    Person p = new Person("Lee", "Richie", Person.Gender.MALE, 38, 1);

    @Test
    @DisplayName("name")
    void shouldReturnName() {

        assertEquals("Lee", p.getName());
    }

    @Test
    @DisplayName("surname")
    void shouldReturnSurname() {

        assertEquals("Richie", p.getSurname());
    }

    @Test
    @DisplayName("gender")
    void shouldReturnGender() {

        assertEquals(Person.Gender.MALE, p.getGender());
    }

    @Test
    @DisplayName("age")
    void shouldReturnAge() {
        assertEquals(38, p.getAge());
    }

    @Test
    @DisplayName("id")
    void shouldReturnId() {
        assertEquals(1, p.getId());
    }
}
