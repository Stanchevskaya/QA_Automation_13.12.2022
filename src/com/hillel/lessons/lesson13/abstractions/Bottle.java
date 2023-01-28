package com.hillel.lessons.lesson13.abstractions;

public abstract class Bottle {
    private int volume;
    private String design;
    private String manufacturer;
    private double grade;

    public Bottle(int volume, String design, String manufacturer, double grade) {
        this.volume = volume;
        this.design = design;
        this.manufacturer = manufacturer;
        this.setGrade(grade);
    }

    public Bottle(){}

    public int getVolume() {
        return volume;
    }

    public String getDesign() {
        return design;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade>=0) {
        this.grade = grade;
    } else
        this.grade = 0;
}
}