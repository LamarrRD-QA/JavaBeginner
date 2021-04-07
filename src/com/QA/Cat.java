package com.QA;

public class Cat extends Animal implements Mammal {

    public Cat(String petName, int age, int feedsPerDay) {
        super(petName, feedsPerDay, age);
    }

    @Override
    public void talk() {
        System.out.println("Meow!");
    }

    @Override
    public void introduce() {
        System.out.println("Meow! Name's " + this.getPetName() + ". I'm " + this.getAge() + " years old.");
    }

    public void purr() {
        System.out.println("Purrrrrr");
    }

    @Override
    public void walk() {
        System.out.println("Walk-jump-walk-jump, I'm not coming down!");
    }
}
