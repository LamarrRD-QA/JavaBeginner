package com.QA;

public class Car extends Vehicle{
    private boolean isAutomatic;
    private String licenseRegNo;

    Car(int numOfWheels, int numOfSeats, String colour, String licenseRegNo, boolean isAutomatic) {
        super(numOfWheels, numOfSeats, colour);
        this.licenseRegNo = licenseRegNo;
        this.isAutomatic = isAutomatic;
    }

    @Override
    double calculateTotal() {
        return isAutomatic ? 500.0 : 300.0;
    }
}
