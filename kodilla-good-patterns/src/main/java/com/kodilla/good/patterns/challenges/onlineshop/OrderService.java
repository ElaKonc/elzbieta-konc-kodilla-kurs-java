package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder(User buyer, User seller, CategoryOfProduct categoryOfProduct, Product product, LocalDateTime dateOfOrder, Payment payment);
}
