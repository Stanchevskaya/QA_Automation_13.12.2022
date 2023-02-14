package com.hillel.homework16;

public class Apples extends Product {
    private String appleType;

    public Apples(double weight, String productName, String manufacturer, String design, String appleType) {
        super(weight, productName, manufacturer, design);
        this.appleType = appleType;
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

    @Override
    public String getDescription() {
        return "Apples:" + getDesign() + "Type " + appleType;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "type=" + appleType + '\'' +
                '}';
    }
}

