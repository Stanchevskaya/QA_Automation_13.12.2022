package com.hillel.homework;

import java.util.Random;

public class Homework9 {
    public static void main(String[] args) {

        Random random = new Random();
        int team1AgeSum = 0;
        int team2AgeSum = 0;

        for (int i = 1; i <= 25; i++) {
            int age = random.nextInt(40 - 18 + 1) + 18;
            team1AgeSum += age;
            System.out.print(age + " ");
        }

        System.out.println();

        for (int i = 1; i <= 25; i++) {
            int age = random.nextInt(40 - 18 + 1) + 18;
            team2AgeSum += age;
            System.out.print(age + " ");
        }

        System.out.println();

        double team1AverageAge = (double) team1AgeSum / 25;
        double team2AverageAge = (double) team2AgeSum / 25;

        System.out.println("Team 1 average age: " + team1AverageAge);
        System.out.println("Team 2 average age: " + team2AverageAge);
    }
}