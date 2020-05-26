package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ExtraFoodShop implements Producer{
    private Map<Product, Integer> productsList;
    private List<Customer> blackList;


    public ExtraFoodShop() {
        productsList = createProductList();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new ProductMeat("udko", "","kaczka"), 10);
        productsList.put(new ProductMeat("szyja", "","indyk"), 5);
        productsList.put(new ProductMeat("pierś", "","kurczak"), 20);
        productsList.put(new ProductDairy("jogurt", "naturalny","nabiał"), 0);
        productsList.put(new ProductDairy("jajka", "ekologiczne, 10 szt.","nabiał"), 50);
        productsList.put(new ProductDairy("ser żółty", "gouda", "nabiał"), 20);
        productsList.put(new ProductJuice("woda z kaktusa", "250 ml","woda"), 10);
        productsList.put(new ProductJuice("sok z aloesa", "250 ml", "sok"), 5);
        productsList.put(new ProductJuice("woda źródlana", "500 ml","woda"), 30);

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
                System.out.println("ExtraFood Shop: Przepraszamy, chwilowo brak jednego z produktów");
                return false;
            }
        }
        return true;
    }
}
