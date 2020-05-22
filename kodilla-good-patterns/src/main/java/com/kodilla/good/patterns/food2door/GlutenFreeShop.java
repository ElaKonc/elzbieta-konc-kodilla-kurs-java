package com.kodilla.good.patterns.food2door;

import java.util.*;

public class GlutenFreeShop implements Producer{
    private final Map<Product, Integer> productsList;
    private final List<Customer> blackList;

    public GlutenFreeShop() {
        productsList = createProductList();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();


        productsList.put(new Product("chleb", "pełnoziarnisty, razowy, 500g"), 50);
        productsList.put(new Product("ryż", "długoziarnisty, biały, 1kg"), 150);
        productsList.put(new Product("ciasteczka owsiane", "250g"), 20);
        productsList.put(new Product("mąka ryżowa", "mąka ryżowa, 1kg"), 4);
        productsList.put(new Product("kukurydza", "kolby, 3szt."), 10);

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
                System.out.println("Gluten Free Shop:\nPrzepraszamy,\nprodukt chwilowo niedostępny.");
                return false;
            }
        }
        return true;
    }
}
