package com.pavdem2012.carmanager;

public class CarManager {

    public static void main(String[] args) {

        Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, "Green");

        Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, "White");
        
        Car renault2 = new Truck("Renault Laguna", 2000, 9700, 1600, "White");

        addDistanceWithCheck(prius, 8320.5);
        addDistanceWithCheck(prius, 2000);
        addDistanceWithCheck(renault, 11000);
        addDistanceWithCheck(renault, 20000);
        addDistanceWithCheck(renault2, 42000);
        addDistanceWithCheck(renault2, 9000.7);

        System.out.println(prius);
        System.out.println(renault);
        System.out.println(renault2);

        System.out.println(renault.equals(renault2));
        System.out.println(renault2.equals(prius));
        System.out.println(renault.equals(prius));

        System.out.println("Готовность к сервису passenger car: " + prius.isReadyToService());
        System.out.println("Готовность к сервису bus: " + renault.isReadyToService());
        System.out.println("Готовность к сервису truck: " + renault2.isReadyToService());
    }
    
    public static void addDistanceWithCheck(Car car, double myDistance) {
        try {
            car.addDistance(myDistance);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
