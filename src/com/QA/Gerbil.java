package com.QA;

public class Gerbil extends Animal implements Mammal {


    private double cageHeight;
    private double cageWidth;
    private double cageDepth;

    public Gerbil(String petName, int age, int feedsPerDay) {
        super(petName, feedsPerDay, age);
    }

    @Override
    public void talk() {
        System.out.println("SQUEAK!!!");
    }

    @Override
    public void introduce() {
        System.out.println("With an age of " + this.getAge() + " and a name of " + this.getPetName() + ", I'm doing alright");
    }

    public void setUpCage(double height, double width, double depth) {
        this.cageHeight = height;
        this.cageWidth = width;
        this.cageDepth = depth;
    }

    @Override
    public void walk() {
        System.out.println("I'm a gerbil but watch me go in this hamsterwheel");
    }

    public String getCageDimensions() {
        return String.format("%fcm x %fcm x %fcm", this.cageHeight, this.cageWidth, this.cageDepth);
    }
}
