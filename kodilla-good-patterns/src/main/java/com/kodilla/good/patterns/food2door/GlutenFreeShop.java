package com.kodilla.good.patterns.food2door;

import java.util.*;

public class GlutenFreeShop implements Producer{
    private Map<Product, Integer> productsList;
    private List<Customer> blackList;


    public GlutenFreeShop() {
        productsList = createProductList();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("chleb", "kukurydziany, bez glutenu"), 10);
        productsList.put(new Product("mąka ryżowa", "1 kg, bez glutenu"), 5);
        productsList.put(new Product("bułka", "kukurydziana, bez glutenu"), 20);
        productsList.put(new Product("ziemniaki", "1 kg, bez glutenu"), 0);
        productsList.put(new Product("orzechy", "włoskie, bez glutenu"), 50);

        return productsList;
    }

    private List<Customer> createBlackList() {
        List<Customer> blackList = new ArrayList<>();
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
                System.out.println("Gluten Free Shop: Przepraszamy, chwilowo brak jednego z produktów");
                return false;
            }
        }
        return true;
    }
}
