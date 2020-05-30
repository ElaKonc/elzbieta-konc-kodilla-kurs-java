package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderRequest {
    private final Customer customer;
    private final Producer producer;
    private final Map<Product, Integer> productOrderRequest;

    public OrderRequest(Customer customer, Producer producer, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.producer = producer;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}
