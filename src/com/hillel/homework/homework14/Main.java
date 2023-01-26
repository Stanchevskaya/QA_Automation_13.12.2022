package com.hillel.homework.homework14;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", LocalDate.of(1995, 5, 20), "john@email.com", "1234567890", "Doe", 82, 120, 10000);
        FitnessTracker user2 = new FitnessTracker("Jane", LocalDate.of(1985, 3, 10), "jane@email.com", "0987654321", "Smith", 56, 110, 8000);
        FitnessTracker user3 = new FitnessTracker("Bob", LocalDate.of(1990, 7, 15), "bob@email.com", "5555555555", "Arella", 75, 110, 1200);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(80);
        user1.setSteps(11000);
        user2.setSurname("Brown");
        user2.setBloodPressure(115);
        user2.setSteps(9500);

        System.out.println("\nUpdated Information: ");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

    }

}
