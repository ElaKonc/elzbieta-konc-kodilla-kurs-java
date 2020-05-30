package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ExtraFoodShop implements Producer{
    private final Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductList();
    }

    @Override
    public String name() {
        return "Extra Food Shop";
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("udko", "kaczka"), 10);
        productsList.put(new Product("szyja", "indyk"), 5);
        productsList.put(new Product("pierś", "kurczak"), 20);
        productsList.put(new Product("jogurt", "naturalny"), 0);
        productsList.put(new Product("jajka", "ekologiczne, 10 szt."), 50);
        productsList.put(new Product("ser żółty", "gouda"), 20);
        productsList.put(new Product("woda z kaktusa", "250 ml"), 10);
        productsList.put(new Product("sok z aloesa", "250 ml"), 5);
        productsList.put(new Product("woda źródlana", "500 ml"), 30);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("ExtraFood Shop: Przepraszamy, chwilowo brak jednego z produktów.\nProsimy o kontakt z obsługą: contact@extrafood-shop.com");
                return false;
            }
        }
        return true;
    }
}
