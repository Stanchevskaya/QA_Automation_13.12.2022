package com.hillel.homework16;

public class Bananas extends Product {

    private String origin;
    private String type;

    public Bananas (double weight, String productName, String manufacturer, String design, String origin, String type) {
        super(weight, productName, manufacturer, design);
        this.origin = origin;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "Bananas:" + getDesign() + "Type " + type;
    }

    @Override
    public String toString() {
        return "Bananas{" +
                "type=" + type +
                ", origin='" + origin + '\'' +
                '}';
    }
}
