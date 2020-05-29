package com.kodilla.good.patterns.food2door;

public class Product {
    private String productName;
    private String productDescription;

    public Product(String productName, String productDescription) {
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!productName.equals(product.productName)) return false;
        return productDescription != null ? productDescription.equals(product.productDescription) : product.productDescription == null;
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        return result;
    }
}
