package com.hillel.homework;

public class Homework6 {
    public static void main(String[] args) {

String team1 = "Team1";
int a = 10;
int b = 7;
int c = 14;
int d = 11;
int e = 12;

String team2 = "Team2";
int f = 18;
int g = 6;
int h = 10;
int i = 13;
int j = 9;

int averageT1 = (a+b+c+d+e)/5;
int averageT2 = (f+g+h+i+j)/5;

if (averageT1 > averageT2) {
    System.out.println("Перемогла команда " + team1 + ", набрала " + averageT1 + " очків.");
} else if (averageT1 < averageT2) {
    System.out.println("Перемогла команда " + team2 + ", набрала " + averageT2 + " очків.");
} else {
    System.out.println("Перемогла дружба, обидві команди набрали " + averageT1 + " очків.");
}






    }
}
