package com.QA;

public class Taxes {
    private static double calculateTaxAmount(double salary) {
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

    public static double calculateTaxFromSalary(double salary) {
        double tax = calculateTaxAmount(salary);
        return salary * tax;
    }
}
