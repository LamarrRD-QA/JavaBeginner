package com.QA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
    private List<Vehicle> garage = new ArrayList<>();
    private double totalBill = 0;

//    public List<Vehicle> getGarage() {
//        return garage;
//    }

    public void add(Vehicle v) {
        this.garage.add(v);
    }

    public void removeByID(int id) {
        if (id < this.garage.size()) {
            this.garage.remove(id);
        }
    }

    public void removeCar() {
        for (Vehicle v : this.garage) {
            if (v instanceof Car) {
                this.garage.remove(v);
                break;
            }
        }
    }

    public void removeTrain() {
        for (Vehicle v : this.garage) {
            if (v instanceof Train) {
                this.garage.remove(v);
                break;
            }
        }
    }

    public double fixVehicle(int index) {
        return this.garage.get(index).calculateTotal();
    }

    public void removeYacht() {
        for (Vehicle v : this.garage) {
            if (v instanceof Yacht) {
                this.garage.remove(v);
                break;
            }
        }
    }

    public void removeMultipleCars(int amount) {
        List<Vehicle> k = this.garage.stream().filter(vehicle -> vehicle instanceof Car).collect(Collectors.toList());
        if (amount > 0 && amount < k.size()) {
            k.subList(0, amount).clear();
        }
    }

    public void removeMultipleTrains(int amount) {
        List<Vehicle> k = this.garage.stream().filter(vehicle -> vehicle instanceof Train).collect(Collectors.toList());
        if (amount > 0 && amount < k.size()) {
            k.subList(0, amount).clear();
        }
    }

    public void removeMultipleYachts(int amount) {
        List<Vehicle> k = this.garage.stream().filter(vehicle -> vehicle instanceof Yacht).collect(Collectors.toList());
        if (amount > 0 && amount < k.size()) {
            k.subList(0, amount).clear();
        }
    }

    public void calculateBill() {
        for (Vehicle v : this.garage) {
            this.totalBill += v.calculateTotal();
        }
        System.out.print("Your bill is: $" + this.totalBill);
    }

    public void emptyGarage() {
        this.garage.clear();
    }

}
