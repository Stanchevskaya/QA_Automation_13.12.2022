package com.hillel.lessons.lesson13.abstractions;

public class Whiskey extends Bottle {

    private int years;
    private String type;

    public void calculateGrade(){
        double grade = getGrade();
        for(int i = 0; i < years; i++) {
            grade +=1;
        }
    }

}
