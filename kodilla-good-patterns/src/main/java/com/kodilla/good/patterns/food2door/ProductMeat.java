package com.kodilla.good.patterns.food2door;

public class ProductMeat extends Product {
    private String typeOfMeat;

    public ProductMeat(String productName, String productDescription, String typeOfMeat) {
        super(productName, productDescription);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductMeat that = (ProductMeat) o;

        return typeOfMeat.equals(that.typeOfMeat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typeOfMeat.hashCode();
        return result;
    }
}
