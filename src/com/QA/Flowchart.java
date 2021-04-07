package com.QA;

public class Flowchart {
    public static int addOrMultiply(int num1, int num2, boolean cond) {
        return cond ? num1 + num2 : num1 * num2;
    }

    public static void createFlowchart(int input) {
        if (input > 2_000) {
            System.out.println("A");
            if (input > 6_000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                if (input > 4_000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if (input > 100) {
                System.out.println("3");
                if (input > 600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if (input > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }
}
