package com.hillel.howework17;

import java.util.ArrayList;
import java.util.Collections;
public class ProductMarket {
    private ArrayList<Product> productList;

    public ProductMarket(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<String> getAllNames() {
        ArrayList<String> names = new ArrayList<String>();
        for (Product product : this.productList) {
            names.add(product.getName());
        }
        return names;
    }

    public ArrayList<String> getAllNamesSorted() {
        ArrayList<String> names = this.getAllNames();
        Collections.sort(names);
        return names;
    }

    public ArrayList<Double> getAllPricesGreaterThan(double minPrice) {
        ArrayList<Double> prices = new ArrayList<Double>();
        for (Product product : this.productList) {
            if (product.getPrice() > minPrice) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public ArrayList<Double> getAllPricesLessThan(double maxPrice) {
        ArrayList<Double> prices = new ArrayList<Double>();
        for (Product product : this.productList) {
            if (product.getPrice() < maxPrice) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public String getAllPricesAsString() {
        ArrayList<String> priceStrings = new ArrayList<String>();
        for (Product product : this.productList) {
            priceStrings.add(Double.toString(product.getPrice()));
        }
        return String.join(",", priceStrings);
    }
}
