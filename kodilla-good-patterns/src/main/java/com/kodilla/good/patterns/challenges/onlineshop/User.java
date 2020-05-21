package com.kodilla.good.patterns.challenges.onlineshop;

import java.util.ArrayList;

public class User {
    private final String nickName;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final int phoneNumber;
    private final String email;
    private final ArrayList<Order> historyOfOrders = new ArrayList<>();

    public User(String nickName, String firstName, String lastName, String address, int phoneNumber, String email) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName= lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void addOrderToHistoryOfOrders(Order order) {
        historyOfOrders.add(order);
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
