package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Producer{
    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("pierś z indyka", "mięso drobiowe, 300g"), 5);
        productsList.put(new Product("mleko kozie", "mleko, 500ml"), 20);
        productsList.put(new Product("sok z aloesa", "sok, 200ml"), 0);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()){
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop:\nPrzepraszamy,\nprodukt chwilowo niedostępny.");
                return false;
            }
        }
        return true;
    }
}
