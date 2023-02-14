package com.hillel.homework16.products;

import com.hillel.homework16.interfaces.Juice;
import com.hillel.homework16.abstraction.Product;

public class Oranges extends Product implements Juice {

        private String sweetness;
        private String orangeType;
        private String seeds;

    public Oranges (double weight, String productName, String manufacturer, String design, String sweetness, String orangeType, String seeds) {
            super(weight, productName, manufacturer, design);
            this.sweetness = sweetness;
            this.orangeType = orangeType;
            this.seeds = seeds;
        }

        @Override
        public String getDescription() {
            return "Oranges:" + getDesign() + "Type " + orangeType;
        }

        @Override
        public String toString() {
            return "Oranges{" +
                    "type=" + orangeType +
                    ", sweetness='" + sweetness + '\'' +
                    '}';
        }

    @Override
    public void juice() {
        System.out.println("We can make an orange juice for you");
    }
    }

