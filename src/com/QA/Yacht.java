package com.QA;

public class Yacht extends Vehicle{
    private double sailArea;
    private boolean isMonohull;

    Yacht(int numOfWheels, int numOfSeats, String colour, double sailArea, boolean isMonohull) {
        super(numOfWheels, numOfSeats, colour);
        this.sailArea = sailArea;
        this.isMonohull = isMonohull;
    }

    @Override
    double calculateTotal() {
        return 0;
    }
}
