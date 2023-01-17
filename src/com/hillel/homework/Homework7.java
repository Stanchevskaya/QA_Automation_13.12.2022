package com.hillel.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter a guess (0-10): ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("You win! The number was " + number);
                    return;
                } else {

                    System.out.println("Try again!");
                }
            } else {
                System.out.println("Invalid input, please enter a number");
                scanner.next();
            }
        }
        System.out.println("You lose. The number was " + number);
    }
}


