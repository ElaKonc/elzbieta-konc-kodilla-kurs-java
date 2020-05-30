package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {
    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer1 = new Customer("Jan", "Kowalski");
        Producer producer1 = new ExtraFoodShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new Product("udko", "kaczka"), 100);
        productsList1.put(new Product("jogurt", "naturalny"), 150);
        productsList1.put(new Product("woda z kaktusa", "250 ml"), 200);

        orderRequestList.add(new OrderRequest(customer1, producer1, productsList1));

        Customer customer2 = new Customer("Adam", "Nowak");
        Producer producer2 = new GlutenFreeShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new Product("chleb", "kukurydziany, bez glutenu"), 1);
        productsList2.put(new Product("bułka", "kukurydziana, bez glutenu"), 20);
        productsList2.put(new Product("orzechy", "włoskie, bez glutenu"), 1);

        orderRequestList.add(new OrderRequest(customer2, producer2, productsList2));

        Customer customer3 = new Customer("Ewelina", "Jeziorańska");
        Producer producer3 = new HealthyShop();
        Map<Product, Integer> productsList3 = new HashMap<>();
        productsList3.put(new Product("chleb", "kukurydziany, bez glutenu"), 1);
        productsList3.put(new Product("sok z aloesu", "500 ml"), 2);
        productsList3.put(new Product("pierś", "indyk"), 1);

        orderRequestList.add(new OrderRequest(customer3, producer3, productsList3));

        return orderRequestList;
    }
}
