package com.company;

public class Television {
    String brand;
    String model;
    double price;
    boolean is4K;
    double size;

    public Television(String brand, String model, double price, boolean is4K, double size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.is4K = is4K;
        this.size = size;
    }

    public void showPriceAfterDiscount (){
        System.out.println(String.format("SALE 50%!!! Price for you: %.2f", price/2));
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", is4K=" + is4K +
                ", size=" + size +
                '}';
    }
}

