package com.QA;

public class Taxes {
    public static double calculateTax(double salary) {
        if (salary >= 0 && salary <= 14_999) {
            return 0;
        } else if (salary >= 15_000 && salary <= 19_999) {
            return 0.1;
        } else if (salary >= 20_000 && salary <= 29_999) {
            return 0.15;
        } else if (salary >= 30_000 && salary <= 44_999) {
            return 0.2;
        } else {
            return 0.25;
        }
    }

    public static double somethingElse(double salary) {
        if (salary >= 0 && salary <= 14_999) {
            return 0;
        } else if (salary >= 15_000 && salary <= 19_999) {
            return 0.1 * salary;
        } else if (salary >= 20_000 && salary <= 29_999) {
            return 0.15 * salary;
        } else if (salary >= 30_000 && salary <= 44_999) {
            return 0.2 * salary;
        } else {
            return 0.25 * salary;
        }
    }
}
