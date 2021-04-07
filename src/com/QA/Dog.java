package com.QA;

public class Dog extends Animal implements Mammal {

    private int lastWalkedTime;


    public Dog(String name, int age, int feedsPerDay) {
        super(name, age, feedsPerDay);
    }

    @Override
    public void talk() {
        System.out.println("Woof woof!");
    }

    @Override
    public void introduce() {
        System.out.println("Woof! My name is " + this.getPetName() + "and I'm " + this.getAge() + " years old.");
    }

    public void setLastWalkedTime(int lastWalkedTime) {
        this.lastWalkedTime = lastWalkedTime;
    }

    public String checkIfWalkNeeded(int currentTime) {
        return this.lastWalkedTime - currentTime >= 180 ? "Walk needed: Yes please!" : "Walk needed: Not yet!";
    }

    @Override
    public void walk() {
        System.out.println("Run run run *pants*");
    }
}
