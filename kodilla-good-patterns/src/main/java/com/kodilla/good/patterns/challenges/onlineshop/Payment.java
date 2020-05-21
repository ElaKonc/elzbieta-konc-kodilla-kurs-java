package com.kodilla.good.patterns.challenges.onlineshop;

public class Payment {
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
