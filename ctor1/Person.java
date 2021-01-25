package com.company;

import java.time.Year;
import java.util.Date;

public class Person {

    public int id;
    public String name;
    public int yearOfBirth; // 0
    public String address;

    // Error!
    //public Circle() {
//
//    }

    // ctor -- no return type
    // must be 100% like class-name


    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name, int yearOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public void sayHello() {
        System.out.println(String.format("Person %s [%d] is saying hello...", name, id));
    }
    public void printHowOldAmI() {
        int age = Year.now().getValue() - yearOfBirth;
        System.out.println(String.format("Person %s is ~%d years old", name, age));
    }
    public void printAddress() {
        System.out.println(String.format("Person %s lives at %s", name, address));
    }

}
