package com.QA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean wentToCatch = false;
        int number = 0;

        do {
            System.out.println("Please enter a number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                wentToCatch = true;
            } else {
                sc.nextLine();
                System.out.println("That's not a number! Try again.");
            }
        } while (!wentToCatch);

        System.out.printf("The number you entered was: %d", number);
    }
}
