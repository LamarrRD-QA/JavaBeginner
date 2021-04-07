package com.QA;

import java.util.ArrayList;
import java.util.List;

public class Results {
    static int physicsScore = 67;
    static int chemistryScore = 67;
    static int biologyScore = 67;
    static double passPercentage = 0.6;

    public static void displayMarks() {
        int total = physicsScore + chemistryScore + biologyScore;
        System.out.println("Physics: " + physicsScore + "/150");
        System.out.println("Chemistry: " + chemistryScore + "/150");
        System.out.println("Biology: " + biologyScore + "/150");
        System.out.println("Total: " + total + "/450");
    }

    private static List<Boolean> generatePassStatuses() {
        List<Boolean> passStatuses = new ArrayList<>();

        passStatuses.add(physicsScore / 150.0 >= passPercentage);
        passStatuses.add(chemistryScore / 150.0 >= passPercentage);
        passStatuses.add(biologyScore / 150.0 >= passPercentage);

        return passStatuses;

    }

    public static void displayPercentage() {
        //List<Boolean> passStatuses = generatePassStatuses();
        double percentage = 100.0 * (physicsScore + chemistryScore + biologyScore) / 450.0;
        long failuresCount = generatePassStatuses().stream().filter(i -> !i).count();

        String message = (percentage < passPercentage) ? "Passed!" : "Failed!";
        System.out.println("Percentage obtained: " + percentage);

        //System.out.println("You have " + message);
        if (failuresCount > 0) {
            System.out.println("You have failed in " + failuresCount + " module(s)");
        } else {
            System.out.println("Congratulations! You have passed");
        }

    }
}
