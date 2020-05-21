package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderDto {
    private final User buyer;
    private final User seller;
    private final CategoryOfProduct categoryOfProduct;
    private final Product product;
    private final boolean isSold;

    public OrderDto(User buyer, User seller, CategoryOfProduct categoryOfProduct, Product product, boolean isSold) {
        this.buyer = buyer;
        this.seller = seller;
        this.categoryOfProduct = categoryOfProduct;
        this.product = product;
        this.isSold = isSold;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public CategoryOfProduct getCategoryOfProduct() {
        return categoryOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
