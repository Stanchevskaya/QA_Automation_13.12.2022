package com.hillel.homework18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public List<String> getAllNames() {
        return productList.stream().map(Product::getName).collect(Collectors.toList());
    }

    public List<String> getAllNamesSorted() {
        return productList.stream().map(Product::getName).sorted().collect(Collectors.toList());
    }

    public List<Double> getAllPricesGreaterThan(double minPrice) {
        return productList.stream().filter(product -> product.getPrice() > minPrice)
                .map(Product::getPrice).collect(Collectors.toList());
    }

    public List<Double> getAllPricesLessThan(double maxPrice) {
        return productList.stream().filter(product -> product.getPrice() < maxPrice)
                .map(Product::getPrice).collect(Collectors.toList());
    }

    public String getAllPricesAsString() {
        return productList.stream().map(product -> Double.toString(product.getPrice()))
                .collect(Collectors.joining(","));
    }
}
