package com.kodilla.good.patterns.food2door;

import java.util.*;

public class GlutenFreeShop implements Producer{
    private final Map<Product, Integer> productsList;

    public GlutenFreeShop() {
        productsList = createProductList();
    }

    @Override
    public String name() {
        return "GluteFree Shop";
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

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: Przepraszamy, chwilowo brak jednego z produktów.\nProsimy o kontakt z obsługą: contact@glutenfree.com");
                return false;
            }
        }
        return true;
    }
}
