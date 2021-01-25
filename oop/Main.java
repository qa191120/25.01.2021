package com.company;

import com.google.gson.Gson;

public class Main
{
    public static void main(String[] args)  {
        // ctor
        // static introduction
        // to string + gson
        // lombok - properties
        Car juke = new Car("Nissan", "Juke", 2020, 1450.00, 50000);
        Car sentra = new Car("Nissan", "Sentra");

        //System.out.println(sentra);
        //System.out.println(juke);

        System.out.println(juke); // this calls toString()

        // class Television
        // data: String brand String model double price bool is4K double size
        // functions: showPriceAfterDiscount => print  price / 2
        // Ctor with ll arguments -- auto generated
        // toString -- auto generated
        // create a tv
        // println the tv
        // run in debug and look in console how the Tv is shown ... hint: like in toString

    }
}
