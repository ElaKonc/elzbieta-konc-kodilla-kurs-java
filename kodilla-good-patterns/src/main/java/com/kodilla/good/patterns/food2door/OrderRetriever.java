package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {
    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer1 = new Customer("Jan", "Kowalski");
        Producer producer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new Product("chleb", "pełnoziarnisty, razowy, 500g"), 2);
        productsList1.put(new Product("ryż", "długoziarnisty, biały, 1kg"), 3);
        productsList1.put(new Product("ciasteczka owsiane", "250g"), 1000);

        orderRequestList.add(new OrderRequest(customer1, producer1, productsList1));

        Customer customer2 = new Customer("Adam", "Nowak");
        Producer producer21 = new GlutenFreeShop();
        Producer producer22 = new HealthyShop();
        Producer producer23 = new ExtraFoodShop();
        Map<Product, Integer> productsList21 = new HashMap<>();
        Map<Product, Integer> productsList22 = new HashMap<>();
        Map<Product, Integer> productsList23 = new HashMap<>();
        productsList22.put(new Product("pierś z indyka", "mięso drobiowe"), 4);
        productsList21.put(new Product("cukinia", "warzywo"), 3);
        productsList23.put(new Product("ryż", "długoziarnisty, biały, 1kg"), 1);

        orderRequestList.add(new OrderRequest(customer2, producer21, productsList21));
        orderRequestList.add(new OrderRequest(customer2, producer22, productsList22));
        orderRequestList.add(new OrderRequest(customer2, producer23, productsList23));

        Customer customer3 = new Customer("Ewelina", "Jeziorańska");
        Producer producer3 = new GlutenFreeShop();
        Map<Product, Integer> productsList3 = new HashMap<>();
        productsList3.put(new Product("chleb", "pełnoziarnisty, razowy, 500g"), 2);
        productsList3.put(new Product("ciasteczka owsiane", "250g"), 3);

        orderRequestList.add(new OrderRequest(customer3, producer3, productsList3));

        return orderRequestList;
    }
}
