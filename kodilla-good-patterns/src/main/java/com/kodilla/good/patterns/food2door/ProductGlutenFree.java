package com.kodilla.good.patterns.food2door;

public class ProductGlutenFree extends Product{
    private String noGluten;

    public ProductGlutenFree(String productName, String productDescription, String noGluten) {
        super(productName, productDescription);
        this.noGluten = noGluten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductGlutenFree that = (ProductGlutenFree) o;

        return noGluten.equals(that.noGluten);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + noGluten.hashCode();
        return result;
    }
}
