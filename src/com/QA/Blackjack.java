package com.QA;

public class Blackjack {
    public static int blackJackScore = 21;

    public static int play(int score1, int score2) {
        int difference1 = blackJackScore - score1;
        int difference2 = blackJackScore - score2;

        if (difference1 < 0 && difference2 < 0) {
            return 0;
        } else if ((difference1 < difference2 && difference1 >= 0) || (difference1 <= blackJackScore && difference2 < 0)) {
            return score1;
        } else if ((difference2 < difference1 && difference2 >= 0) || (difference2 <= blackJackScore && difference1 < 0)) {
            return score2;
        } else {
            return 0;
        }
    }
}
