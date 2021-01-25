package com.company;

import com.google.gson.Gson;

public class Main
{
    public static void main(String[] args)  {
        // ctor
        // static introduction
        // to string + gson
        // lombok - properties
        Person shlomi = new Person(3, "Shlomi", 1999, "Hertzelyia");
        shlomi.printHowOldAmI();
        Person danny = new Person(2);
    }
}
