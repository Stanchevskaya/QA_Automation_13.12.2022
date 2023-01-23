package com.hillel.homework;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String lettuce;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("Regular burger: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = null;
        System.out.println("Diet burger: " + bun + ", " + meat + ", " + cheese + ", " + lettuce);
    }

    public Burger(String bun, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = null;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = null;
        System.out.println("Vegetarian burger: " + bun + ", " + cheese + ", " + lettuce);
    }
}