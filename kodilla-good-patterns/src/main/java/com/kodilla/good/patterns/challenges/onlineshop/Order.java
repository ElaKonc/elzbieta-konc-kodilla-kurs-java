package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class Order {
    private final User buyer;
    private final User seller;
    private final CategoryOfProduct categoryOfProduct;
    private final Product product;
    private final LocalDateTime dateOfOrder;
    private final Payment paymentMethod;

    public Order(User buyer, User seller, CategoryOfProduct categoryOfProduct, Product product, LocalDateTime dateOfOrder, Payment paymentMethod) {
        this.buyer = buyer;
        this.seller = seller;
        this.categoryOfProduct = categoryOfProduct;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
        this.paymentMethod = paymentMethod;
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

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }
}
