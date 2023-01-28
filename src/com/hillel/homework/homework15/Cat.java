package com.hillel.homework.homework15;

public class Cat {
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be less or equal to 0.");
        }
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0.");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be less or equal to 0.");
        }
        this.weight = weight;
    }
}
