package com.company;

import java.time.Year;
import java.util.Date;

public class Person {

    public int id;
    public String name;
    public int yearOfBirth;
    public String address;

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
