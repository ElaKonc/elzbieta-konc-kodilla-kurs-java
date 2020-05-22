package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderService {
    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("Przetwarzanie zamówienia " + n.getCustomer().getFirstName() + " " + n.getCustomer().getLastName());
                    return n.getProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Zamówienie skompletowane: " + t + "\n"));
    }
}
