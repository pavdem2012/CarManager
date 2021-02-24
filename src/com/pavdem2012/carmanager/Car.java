package com.pavdem2012.carmanager;

public abstract class Car implements Serviceable {
    String name;
    int yearOfProdaction;
    int price;
    int weight;
    Color color;
    private double distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProdaction, int price, int weight, String color) {
        this.name = name;
        this.yearOfProdaction = yearOfProdaction;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color);
    }

    public void addDistance(double additinalDistance) {
        if (additinalDistance <= 0) {
            throw new ArithmeticException("ATTENTION!!!УВАГА!!!ПРОБЕГ НЕ МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ!!!");
        }
        else  { 
            distance += additinalDistance;
            distanceOnService += additinalDistance;
        }
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
                + weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + weight;
        result = prime * result + yearOfProdaction;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (color != other.color)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (weight != other.weight)
            return false;
        if (yearOfProdaction != other.yearOfProdaction)
            return false;
        return true;
    }
}
