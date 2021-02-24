package com.pavdem2012.carmanager;

public class Bus extends Car {

    public Bus(String name, int yearOfProdaction, int price, int weight, String color) {
        super(name, yearOfProdaction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 30000) {
            return true;
        } else {
            return false;
    }
    }
}
