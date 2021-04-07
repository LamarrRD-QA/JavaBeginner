package com.QA;

public abstract class Animal {
    private String petName;
    private int feedsPerDay;
    private int age;

    protected Animal(String petName, int feedsPerDay, int age) {
        this.petName = petName;
        this.feedsPerDay = feedsPerDay;
        this.age = age;
    }

    abstract public void talk();
    abstract public void introduce();

    public void eat() {
        System.out.println("You should feed me " + this.feedsPerDay + " times today. Yum yum");
    }

    public int getAge() {
        return this.age;
    }

    public String getPetName() {
        return this.petName;
    }
}
