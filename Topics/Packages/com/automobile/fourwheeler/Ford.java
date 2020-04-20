package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
        super();
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void tempControl() {
        System.out.println("Accessing the AC.");
    }

}
