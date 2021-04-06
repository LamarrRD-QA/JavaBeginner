package com.QA;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> people = new ArrayList<>();

    public void addHuman(Person p) {
        this.people.add(p);
    }

    public boolean search(String name) {
        boolean found = false;
        for (Person p : people) {
            if (p.getName().equals(name)) {
                found = true;
                break;
            }
        }
        return found;
//        return people.stream().anyMatch(person -> person.getName() == name);
    }

    public void printPeople() {
        people.forEach(System.out::println);
    }
}
