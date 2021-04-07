package com.QA;

public class Goldfish extends Animal implements Fish{

    private double volOfBowl;

    public Goldfish(String petName, int age, int feedsPerDay) {
        super(petName, feedsPerDay, age);
    }

    @Override
    public void talk() {
        System.out.println("Blubber blubber!");
    }

    @Override
    public void introduce() {
        System.out.println("Blubber! " + getPetName() + ". " + getAge() + ". Done.");
    }

    public void addWater(double amount) {
        this.volOfBowl += amount;
    }

    public void removeWater(double amount) {
        this.volOfBowl -= amount;
    }

    public double getVolOfBowl() {
        return this.volOfBowl;
    }

    @Override
    public void swim() {
        System.out.println("Just keep swimming, just keep swimming...");
    }
}
