package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class OrderServiceCashOnDelivery implements OrderService {
    @Override
    public boolean createOrder(User buyer, User seller, CategoryOfProduct categoryOfProduct, Product product, LocalDateTime dateOfOrder, Payment payment) {
        System.out.println("Informacje o zamówieniu\nkategoria produktu: " + categoryOfProduct.getCategoryOfProduct() +
                "\nprodukt: " + product.getProductName() +
                "\nklient: " + buyer.getNickName() +
                "\nsprzedawca: " + seller.getNickName() +
                "\ndata zmówienia: " + dateOfOrder +
                "\nmetoda płatności: " + payment.getPaymentMethod() + "\n");
        return true;
    }

}
