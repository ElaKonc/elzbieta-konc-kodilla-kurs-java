package com.kodilla.good.patterns.food2door;

import java.util.*;

public class HealthyShop implements Producer {
    private Map<Product, Integer> productsList;
    private List<Customer> blackList;


    public HealthyShop() {
        productsList = createProductList();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("chleb", "kukurydziany, bez glutenu"), 10);
        productsList.put(new Product("makaron ryżowy", "250 g, bez glutenu"), 5);
        productsList.put(new Product("sok z aloesu", "500 ml"), 20);
        productsList.put(new Product("jajka", "ekologiczne, 6 szt."), 0);
        productsList.put(new Product("pierś", "indyk"), 5);

        return productsList;
    }

    private List<Customer> createBlackList() {
        List<Customer> blackList = new ArrayList<>();
        blackList.add(new Customer("Jan", "Kowalski"));
        return blackList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (!blackList.contains(customer) && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop: Przepraszamy, chwilowo brak jednego z produktów");
                return false;
            }
        }
        return true;
    }
}
