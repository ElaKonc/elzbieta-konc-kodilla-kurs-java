package com.kodilla.good.patterns.challenges.onlineshop;

public class InformationServiceSMS implements InformationService {
    @Override
    public void informationAboutOrder(User user) {
        System.out.println("SMS dotyczący zamówienia został wysłany do " + user.getNickName() + "\n");
    }
}
