package com.QA;

public class Train extends Vehicle{
    private int passengerSize;
    private int carriageAmount;

    Train(int numOfWheels, int numOfSeats, String colour, int passengerSize, int carriageAmount) {
        super(numOfWheels, numOfSeats, colour);
        this.passengerSize = passengerSize;
        this.carriageAmount = carriageAmount;
    }

    @Override
    double calculateTotal() {
        return 0;
    }
}
