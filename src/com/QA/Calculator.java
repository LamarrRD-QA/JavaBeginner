package com.QA;

public class Calculator {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static Double division(double num1, double num2) {
        if (num1 < num2) {
            return num1 / num2;
        } else {
            System.err.println("Division of "  + num1 + " and " + num2 + " cannot be performed");
            return null;
        }
    }


}
