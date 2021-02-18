package com.pavdem2012.carmanager;

public class Car {
    String name;
    int yearOfProdaction;
    int price;
    int weight;
    Color color;

    public Car(String name, int yearOfProdaction, int price, int weight, String color) {
        this.name = name;
        this.yearOfProdaction = yearOfProdaction;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color);
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
                + weight + ", color=" + color + "]";
    }

}
