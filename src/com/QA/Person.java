package com.QA;

public class Person {
    private String name;
    private int age;
    private String jobTitle;

    Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nAge: %s%nJob Title: %s", this.name, this.age, this.jobTitle);
    }



    public String getName() {
        return this.name;
    }
}
