package com.pavdem2012.carmanager;

public class Bulldozer extends AgriculturalMachinery {

    public Bulldozer(String name, int yearOfProdaction, int price, int weight, String color) {
        super(name, yearOfProdaction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
