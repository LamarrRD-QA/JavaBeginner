package com.QA;

public class Main {

    public static void main(String[] args) {
        Dog clifford = new Dog("Clifford", 5, 4);
        Cat fluffy = new Cat("Fluffy", 8, 3);
        Gerbil gary = new Gerbil("Gary", 2, 2);
        Goldfish goldy = new Goldfish("Goldy", 7, 2);

        System.out.println("---------------Dog---------------");
        clifford.introduce();
        clifford.setLastWalkedTime(380);
        System.out.println(clifford.checkIfWalkNeeded(450));

        System.out.println(clifford.checkIfWalkNeeded(900));
        clifford.walk();
        clifford.talk();
        clifford.eat();

        System.out.println("---------------Cat---------------");
        fluffy.introduce();
        fluffy.purr();

        fluffy.walk();
        fluffy.talk();
        fluffy.eat();

        System.out.println("---------------Gerbil---------------");
        gary.setUpCage(60,60,60);
        System.out.println(gary.getCageDimensions());

        gary.introduce();

        gary.walk();
        gary.talk();
        gary.eat();

        System.out.println("---------------Goldfish---------------");
        goldy.addWater(50);
        System.out.println(goldy.getVolOfBowl());
        goldy.introduce();
        goldy.removeWater(20);
        System.out.println(goldy.getVolOfBowl());

        goldy.talk();
        goldy.swim();
        goldy.eat();
    }
}
