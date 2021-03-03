package com.pavdem2012.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static void main(String[] args) {

        Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, "Green");

        Car bus = new Bus("Neoplan", 2000, 9700, 1600, "White");

        Car truck = new Truck("Камаз К5", 2000, 9700, 1600, "White");
        // Добавление и вывод коллекции (Car)
        List<Car> cars = new ArrayList<>();
        cars.add(prius);
        cars.add(bus);
        cars.add(truck);
        System.out.println(cars);

        AgriculturalMachinery bulldozer = new Bulldozer("Казахстан", 1972, 9000, 12000, "Blue");
        
        AgriculturalMachinery harvester = new Harvester("Енисей", 1995, 25000, 8500, "Red");
        // Добавление и вывод коллекции (AgriculturalMachinery)
        List<AgriculturalMachinery> agriculturalMachineries = new ArrayList<>();
        agriculturalMachineries.add(bulldozer);
        agriculturalMachineries.add(harvester);
        System.out.println(agriculturalMachineries);
    
        addDistanceWithCheck(bulldozer, 1200);
        addDistanceWithCheck(harvester, 1000);
        addDistanceWithCheck(prius, 8320.5);
        addDistanceWithCheck(prius, 2000);
        addDistanceWithCheck(bus, 11000);
        addDistanceWithCheck(bus, 20000);
        addDistanceWithCheck(truck, 42000);
        addDistanceWithCheck(truck, 9000.7);

        System.out.println(bulldozer);
        System.out.println(harvester);
        System.out.println(prius);
        System.out.println(bus);
        System.out.println(truck);

        System.out.println(bus.equals(truck));
        System.out.println(truck.equals(prius));
        System.out.println(bus.equals(prius));

        System.out.println("Готовность к сервису \"Казахстан\": " + bulldozer.isReadyToService());
        System.out.println("Готовность к сервису \"Енисей\": " + harvester.isReadyToService());
        System.out.println("Готовность к сервису \"Prius\": " + prius.isReadyToService());
        System.out.println("Готовность к сервису \"Neoplan\": " + bus.isReadyToService());
        System.out.println("Готовность к сервису \"Камаз К5\": " + truck.isReadyToService());
    }
    
    public static void addDistanceWithCheck(Car car, double myDistance) {
        try {
            car.addDistance(myDistance);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static <AgriculturalMachineryr> void addDistanceWithCheck(AgriculturalMachineryr harvester, double myDistance) {
        try {
            ((AgriculturalMachinery) harvester).addDistance(myDistance);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
