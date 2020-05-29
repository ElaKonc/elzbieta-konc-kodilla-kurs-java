package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ExtraFoodShop implements Producer{
    private final Map<Product, Integer> productsList;
    private final List<Customer> blackList;


    public ExtraFoodShop() {
        productsList = createProductList();
        blackList = createBlackList();
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

    private List<Customer> createBlackList() {
        List<Customer> blackList = new ArrayList<>();
        blackList.add(new Customer("Jan", "Kowalski"));
        return blackList;
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("ExtraFood Shop: Przepraszamy, chwilowo brak jednego z produktów");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (!blackList.contains(customer) && isProductsAvailable(productsOrders));
    }
}
