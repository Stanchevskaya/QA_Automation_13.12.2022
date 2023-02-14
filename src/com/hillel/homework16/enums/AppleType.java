package com.hillel.homework16.enums;

public enum AppleType {

    RED("red"),
    GREEN("green"),
    YELLOW("yellow");

    private String name;

    AppleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}