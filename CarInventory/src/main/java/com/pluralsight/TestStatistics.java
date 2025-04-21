package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {

        int[] scores = {73, 82, 84, 90, 89, 97, 75, 78, 85};

        int sum = 0;
        int highScore = scores[0];
        int lowScore = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > highScore) {
                highScore = score;
            }

            if (score < lowScore) {
                lowScore = score;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Test Scores Statistics:");
        System.out.println("------------------------");
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score : " + lowScore);
    }
}