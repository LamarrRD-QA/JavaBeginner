package com.QA;

public class UniqueSum {
    public static int sumOf(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return 0;
        }

        if (num1 == num2) {
            return num3;
        } else if (num1 == num3) {
            return num2;
        } else if (num2 == num3) {
            return num1;
        }

        return num1 + num2 + num3;
    }
}
