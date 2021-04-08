package com.QA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
    private List<Person> people = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private int option = 0;

    public void addHuman(Person p) {
        this.people.add(p);
    }

    public String search(String name) {
//        boolean found = false;
//        for (Person p : people) {
//            if (p.getName().equals(name)) {
//                found = true;
//                break;
//            }
//        }
//        return found;
        return people.stream().anyMatch(person -> person.getName().equals(name)) ? name + " found" : name + " not found!";
    }

    public void printPeople() {
        people.forEach(System.out::println);
    }

    private void printMenu() {
        System.out.println("Welcome to the Person Manager. What would you like to do today?");
        System.out.println("1) Create a person");
        System.out.println("2) Output people to console");
        System.out.println("3) Search for a person");
    }

    private void printCreatePersonMenu() {
        boolean status = false;
        int age = 0;

        System.out.println("Enter name of person: ");
        String name = PersonManager.sc.nextLine().strip();

        do {
            System.out.println("Enter age of person: ");
            if (PersonManager.sc.hasNextInt()) {
                age = PersonManager.sc.nextInt();
                status = true;
                PersonManager.sc.nextLine();
            } else {
                PersonManager.sc.nextLine();
                System.out.println("Invalid age!");
            }
        } while (!status);

        System.out.println("Enter job title of person: ");
        String jobTitle = PersonManager.sc.nextLine().strip();

        this.people.add(new Person(name, age, jobTitle));
    }

    private void printOuptputPeopleMenu() {
        System.out.println("This is a list of people you requested");
        printPeople();
    }

    private void printSearchPersonMenu() {
        System.out.println("Enter name of person you would like to search: ");
        String name = PersonManager.sc.nextLine().strip();
        System.out.println(search(name));
    }

    public void doMenu() {
        boolean status = false;

        do {
            printMenu();
            if (PersonManager.sc.hasNextInt()) {
                this.option = PersonManager.sc.nextInt();
                status = true;
            } else {
                PersonManager.sc.nextLine();
                System.out.println("Invalid option!");
            }
        } while (!status);

        PersonManager.sc.nextLine();

        switch (this.option) {
            case 1:
                printCreatePersonMenu();
                break;
            case 2:
                printOuptputPeopleMenu();
                break;
            case 3:
                printSearchPersonMenu();
                break;
            default:
                System.out.println("Meh");
                break;
        }
    }


}
