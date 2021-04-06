package com.QA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person personOne = new Person("Lamarr", 25, "Junior Developer");
        Person personTwo = new Person("Jessica", 23, "Graphic Designer");
        Person personThree = new Person("John", 26, "Senior Developer");

        PersonManager people = new PersonManager();

        people.addHuman(personOne);
        people.addHuman(personTwo);
        people.addHuman(personThree);

        System.out.println(people.search("John"));
        people.printPeople();
    }
    

}
