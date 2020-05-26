package com.kodilla.good.patterns.food2door;

public class ProductDairy extends Product {
    private String isDairy;

    public ProductDairy(String productName, String productDescription, String isDairy) {
        super(productName, productDescription);
        this.isDairy = isDairy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductDairy that = (ProductDairy) o;

        return isDairy.equals(that.isDairy);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + isDairy.hashCode();
        return result;
    }
}
