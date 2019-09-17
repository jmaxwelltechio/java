package com.marcusbiel.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person chris = new Person();
        assertEquals("Hello World", chris.helloWorld());
    }

    @Test
    public void shouldReturnHelloChris() {
        Person person1 = new Person();
        assertEquals("Hello Chris", person1.hello("Chris"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person2 = new Person();
        Person person3 = new Person();
        Person personXxx = new Person();

        assertEquals(3, Person.numberOfPersons());
    }
}