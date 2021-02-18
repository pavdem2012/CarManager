package com.pavdem2012.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 2008,  15000, 1200, Color.Green);

		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, Color.White);

		System.out.println(prius);

		System.out.println(renault);
	}

}
