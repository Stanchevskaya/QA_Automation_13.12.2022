package com.hillel.homework.homework15;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Cat kitty = new Cat("Kitty", 1, 0.9);
        String kittyName = kitty.getName();
        int kittyAge = kitty.getAge();
        double kittyWeight = kitty.getWeight();

        System.out.println("Cat name: " + kittyName);
        System.out.println("Cat's age: " + kittyAge);
        System.out.println("Cat's weight: " + kittyWeight);
    }
}
