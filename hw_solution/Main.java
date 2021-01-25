package com.company;

import com.google.gson.Gson;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {
        Circle c1 = new Circle();
        c1.radius = 4.5;
        c1.printSize();

        Circle c2 = new Circle();
        c2.radius = 8.7;
        c2.printSize();

        Person danny = new Person();
        danny.id = 1;
        danny.name = "Danny";
        danny.yearOfBirth = 1980;
        danny.address = "Keysariya";

    }
}
