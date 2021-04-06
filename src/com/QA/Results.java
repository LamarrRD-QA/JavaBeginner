package com.QA;

public class Results {
    static int physicsScore = 127;
    static int chemistryScore = 87;
    static int biologyScore = 55;

    public static void DisplayMarks() {
        int total = physicsScore + chemistryScore + biologyScore;
        System.out.println("Physics: " + physicsScore + "/150");
        System.out.println("Chemistry: " + chemistryScore + "/150");
        System.out.println("Biology: " + biologyScore + "/150");
        System.out.println("Total: " + total + "/450");
    }

    public static void DisplayPercentage() {
        double percentage = 100.0 * (physicsScore + chemistryScore + biologyScore) / 450.0;
        System.out.println("Percentage obtained: " + percentage);
    }
}
