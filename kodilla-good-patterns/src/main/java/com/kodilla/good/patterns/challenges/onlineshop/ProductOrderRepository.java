package com.kodilla.good.patterns.challenges.onlineshop;

import java.util.ArrayList;

public class ProductOrderRepository implements OrderRepository {
    private static ArrayList<Order> orderRepository = new ArrayList<>();

    @Override
    public void addOrderToRepository(Order order) {
        orderRepository.add(order);
        System.out.println("Zamówienie zostało dodane do kolejki.\n");
    }
}
