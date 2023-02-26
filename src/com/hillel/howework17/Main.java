package com.hillel.howework17;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Apple", 3.99));
        productList.add(new Product("Banana", 4.49));
        productList.add(new Product("Orange", 5.79));
        productList.add(new Product("Pineapple", 11.99));

        ProductMarket market = new ProductMarket(productList);

        System.out.println("All names: " + market.getAllNames());
        System.out.println("All names sorted: " + market.getAllNamesSorted());
        System.out.println("Prices greater than 10.00: " + market.getAllPricesGreaterThan(10.01));
        System.out.println("Prices less than 5.00: " + market.getAllPricesLessThan(4.99));
        System.out.println("Prices as string: " + market.getAllPricesAsString());
}
}
