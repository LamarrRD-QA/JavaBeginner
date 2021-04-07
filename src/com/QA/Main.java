package com.QA;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.add(new Car(4,5,"red", "2GEZ704", false));
        garage.add(new Train(64, 120, "blue", 180, 8));
        garage.add(new Yacht(0, 16, "pink", 75, false));

        garage.calculateBill();

        //garage.getGarage().forEach(System.out::println);
        garage.removeCar();

    }
}
