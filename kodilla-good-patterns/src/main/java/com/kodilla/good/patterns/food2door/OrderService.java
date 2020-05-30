package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderService {
    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println(n.getProducer().name() + ": Przetwarzanie zamówienia dla: " + n.getCustomer().getFirstName() + " " + n.getCustomer().getLastName());
                    return n.getProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> {if(t){
                    System.out.println("Zamówienie skompletowane\n");
                } else {
                    System.out.println("Nie można skompletować zamówienia\n");
                }
                });
    }
}
