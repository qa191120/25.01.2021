package com.company;

public class Circle {

    public double radius;

    public void printSize() {
        //System.out.println("circle size");
        //         Math.PI * Math.pow(radius, 2);
        System.out.println(String.format("circle size %f", Math.PI * Math.pow(radius, 2)));

    }
}
