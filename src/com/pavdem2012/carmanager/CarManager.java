package com.pavdem2012.carmanager;

public class CarManager {

    public static void main(String[] args) {

        Car prius = new Car("Toyota Prius", 2008, 15000, 1200, "Green");

        Car renault = new Car("Renault Laguna", 2000, 9700, 1600, "White");
        
        Car renault2 = new Car("Renault Laguna", 2000, 9700, 1600, "White");

        addDistanceWithCheck(prius, -12320.5);
        addDistanceWithCheck(renault, 22500);
        addDistanceWithCheck(renault, 12345);
        addDistanceWithCheck(renault, 33.7);

        System.out.println(prius);
        System.out.println(renault);
        System.out.println(renault2);

        System.out.println(renault.equals(renault2));
        System.out.println(renault2.equals(prius));
        System.out.println(renault.equals(prius));
    }
    
    public static void addDistanceWithCheck(Car car, double myDistance) {
        try {
            car.addDistance(myDistance);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
