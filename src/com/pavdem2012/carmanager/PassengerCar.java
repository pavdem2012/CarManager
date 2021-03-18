package com.pavdem2012.carmanager;

public class PassengerCar extends Car {

    public PassengerCar(String name, int yearOfProdaction, int price, int weight, String color) {
        super(name, yearOfProdaction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 10000) {
            return true;
        } else {
            return false;
        }
    }
}
