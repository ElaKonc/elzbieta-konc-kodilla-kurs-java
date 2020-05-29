package com.kodilla.good.patterns.food;

public interface FoodDistributor {
    OrderDTO process(Order order);
    String getDistributorName();
}
