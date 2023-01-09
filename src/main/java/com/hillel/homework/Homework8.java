package com.hillel.homework;

public class Homework8 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; count < 100; i++) {
            String str = Integer.toString(i);
            if (!str.contains("4") && !str.contains("9")) {
                count++;
                System.out.println(i);
            }
        }
    }
}

