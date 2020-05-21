package com.kodilla.good.patterns.challenges.onlineshop;

public class InformationServiceMail implements InformationService{
    @Override
    public void informationAboutOrder(User user) {
        System.out.println("E-mail dotyczący zamówienia został wysłany do " + user.getNickName() + "\n");
    }
}
