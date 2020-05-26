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
        productsList1.put(new ProductMeat("udko", "","kaczka"), 150);
        productsList1.put(new ProductDairy("jogurt", "naturalny","nabiał"), 20);
        productsList1.put(new ProductJuice("woda z kaktusa", "250 ml","woda"), 100);

        orderRequestList.add(new OrderRequest(customer1, producer1, productsList1));

        Customer customer2 = new Customer("Adam", "Nowak");
        Producer producer2 = new GlutenFreeShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new ProductGlutenFree("chleb", "kukurydziany","bez glutenu"), 2);
        productsList2.put(new ProductGlutenFree("bułka", "kukurydziana","bez glutenu"), 25);
        productsList2.put(new ProductGlutenFree("orzechy", "włoskie","bez glutenu"), 10);

        orderRequestList.add(new OrderRequest(customer2, producer2, productsList2));

        Customer customer3 = new Customer("Ewelina", "Jeziorańska");
        Producer producer3 = new HealthyShop();
        Map<Product, Integer> productsList3 = new HashMap<>();
        productsList3.put(new ProductGlutenFree("chleb", "kukurydziany","bez glutenu"), 1);
        productsList3.put(new ProductJuice("sok z aloesu", "500 ml","sok"), 2);
        productsList3.put(new ProductMeat("pierś", "","indyk"), 1);

        orderRequestList.add(new OrderRequest(customer3, producer3, productsList3));

        return orderRequestList;
    }
}
