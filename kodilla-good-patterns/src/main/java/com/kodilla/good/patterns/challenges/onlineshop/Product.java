package com.kodilla.good.patterns.challenges.onlineshop;

public class Product {
    private final String productName;
    private final double quantityOfProduct;

    public Product(String productName, double quantityOfProduct) {
        this.productName = productName;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantityOfProduct() {
        return quantityOfProduct;
    }
}
