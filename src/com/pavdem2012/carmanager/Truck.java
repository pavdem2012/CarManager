package com.pavdem2012.carmanager;

public class Truck extends Car {

    public Truck(String name, int yearOfProdaction, int price, int weight, String color) {
        super(name, yearOfProdaction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
