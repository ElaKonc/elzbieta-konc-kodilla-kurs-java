package com.kodilla.good.patterns.food2door;

public class ProductJuice extends Product {
    private String toDrink;

    public ProductJuice(String productName, String productDescription, String toDrink) {
        super(productName, productDescription);
        this.toDrink = toDrink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductJuice that = (ProductJuice) o;

        return toDrink.equals(that.toDrink);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + toDrink.hashCode();
        return result;
    }
}
