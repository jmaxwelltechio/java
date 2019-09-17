package com.marcusbiel.javacourse.lesson2;


import com.marcusbiel.javacourse.lesson3.Name;



public class Person {

    private static int personCounter;

    // instance variables
    private Name personName;

    // constructor
    public Person(Name personName) {
        this.personName = personName;
    }

    // default constructor
    public Person() {
        personCounter = personCounter + 1;
    }


    public String helloWorld() {
        return "Hello World";
    }

    public Name name() {
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
