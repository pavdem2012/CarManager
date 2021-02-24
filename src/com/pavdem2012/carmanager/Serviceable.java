package com.pavdem2012.carmanager;

public interface Serviceable {
    public boolean isReadyToService();

    public int getDistanceOnService();

    public void addDistance(double additinalDistance);

    public double getDistance();
}
