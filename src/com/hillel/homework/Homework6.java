package com.hillel.homework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team 1 name: ");
        String team1Name = scanner.nextLine();

        int[] team1Scores = new int[5];
        for (int i = 0; i < team1Scores.length; i++) {
            System.out.println("Enter score for player " + (i+1) + " on team 1: ");
            team1Scores[i] = scanner.nextInt();
        }

        System.out.println("Enter team 2 name: ");
        String team2Name = scanner.next();

        int[] team2Scores = new int[5];
        for (int i = 0; i < team2Scores.length; i++) {
            System.out.println("Enter score for player " + (i+1) + " on team 2: ");
            team2Scores[i] = scanner.nextInt();
        }

        int team1Total = 0;
        for (int score : team1Scores) {
            team1Total += score;
        }
        double team1Average = (double) team1Total / team1Scores.length;


        int team2Total = 0;
        for (int score : team2Scores) {
            team2Total += score;
        }
        double team2Average = (double) team2Total / team2Scores.length;


        String winningTeamName = "";
        double winningScore = 0;
        if (team1Average > team2Average) {
            winningTeamName = team1Name;
            winningScore = team1Average;
            System.out.println("The winning team is " + winningTeamName + " with a score of " + winningScore + " points.");

        } else if (team1Average < team2Average){
            winningTeamName = team2Name;
            winningScore = team2Average;
            System.out.println("The winning team is " + winningTeamName + " with a score of " + winningScore + " points.");
        } else;

        System.out.println("Both teams scored " + winningScore + " points.");
    }
}