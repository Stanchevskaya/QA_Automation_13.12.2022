package com.hillel.homework16;

public abstract class Product {

    private double weight;
    private String productName;
    private String manufacturer;
    private String design;

    public Product(double weight, String productName, String manufacturer, String design) {
        this.weight = weight;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.design = design;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public abstract String getDescription();
}