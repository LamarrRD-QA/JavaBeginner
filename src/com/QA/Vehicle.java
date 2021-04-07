package com.QA;

public abstract class Vehicle {
    private int numOfWheels;
    private int numOfSeats;
    private String colour;

    Vehicle(int numOfWheels, int numOfSeats, String colour) {
        this.numOfWheels = numOfWheels;
        this.numOfSeats = numOfSeats;
        this.colour = colour;
    }

    abstract double calculateTotal();

}
