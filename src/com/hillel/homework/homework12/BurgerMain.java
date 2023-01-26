package com.hillel.homework.homework12;

import com.hillel.homework.homework12.Burger;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger( "bun", "meat", "cheese", "lettuce", "mayonnaise");
        Burger dietBurger = new Burger("bun", "meat", "cheese", "lettuce");
        Burger veggieBurger = new Burger("bun", "cheese", "lettuce");
    }
}