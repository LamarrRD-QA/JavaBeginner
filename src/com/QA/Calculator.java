package com.QA;

import java.util.Scanner;

public class Calculator {
    private final Scanner sc = new Scanner(System.in);
    private double num1;
    private double num2;
    private int option = 0;

    private double add() {
        return this.num1 + this.num2;
    }

    private double subtract() {
        return this.num1 - this.num2;
    }

    private double multiply() {
        return this.num1 * this.num2;
    }

    private double divide() {
        return this.num1 / this.num2;
    }

    private void printMenu() {
        System.out.println("What math operation would you like to do");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
    }

    private void printMathMenu() {
        boolean checkOne = false;
        boolean checkTwo = false;

        do {
            System.out.println("Input first number: ");
            if (this.sc.hasNextDouble()) {
                this.num1 = this.sc.nextDouble();
                checkOne = true;
            } else {
                this.sc.nextLine();
                System.out.println("Invalid number!");
            }
        } while (!checkOne);

        do {
            System.out.println("Input second number: ");
            if (this.sc.hasNextDouble()) {
                this.num2 = this.sc.nextDouble();
                checkTwo = true;
            } else {
                this.sc.nextLine();
                System.out.println("Invalid number!");
            }
        } while (!checkTwo);
    }

    public void chooseArithmetic() {

        boolean checkStatus = false;
        do {
            printMenu();
            if (this.sc.hasNextInt()) {
                this.option = this.sc.nextInt();
                checkStatus = true;
            } else {
                this.sc.nextLine();
                System.out.println("Invalid option selected!");
            }

        } while (!checkStatus);

    }

    public void calculate() {
        double result = 0.0;

        printMathMenu();
        switch (this.option) {
            case 1:
                result = add();
                break;
            case 2:
                result = subtract();
                break;
            case 3:
                result = multiply();
                break;
            case 4:
                result = divide();
                break;
            default:
                System.out.println("Meh.");
        }
        System.out.printf("Your result is: %f", result);
    }
}
