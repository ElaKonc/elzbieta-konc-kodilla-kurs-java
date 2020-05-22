package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements Producer {
    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("jogurt", "naturalny, 200g"), 20);
        productsList.put(new Product("chipsy jabłkowe", "naturalne chipsy jabłkowe, 250g"), 15);
        productsList.put(new Product("sok z buraka", "naturalny sok z burak czerwonego, 300ml"), 20);
        productsList.put(new Product("cukinia", "warzywo"),10);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 2 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop:\nPrzepraszamy,\nprodukt chwilowo niedostępny.");
                return false;
            }
        }
        return true;
    }
}
