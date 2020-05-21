package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class OrderRetriever {
    public Order retrieve1() {

        User exampleBuyer = new User("kowal0011", "Jan", "Kowalski", "Nowowiejska 1, 01-001 Warszawa", 111222333, "jkowal01@tlen.pl");
        User exampleSeller = new User("t_jezioranski", "Tadeusz", "Jeziorański", "Stalowa 57, 26-015 Kraków", 123456789, "t.jezioranski@gmail.com");
        Product exampleProduct = new Product("Laptop", 1);
        LocalDateTime exampleDateOfOrder = LocalDateTime.of(2020, 3, 15, 10, 38, 23);
        Payment examplePaymentMethod = new Payment("Gotówka");
        CategoryOfProduct exampleCategoryOfProduct = new CategoryOfProduct("Elektronika");

        return new Order(exampleBuyer, exampleSeller, exampleCategoryOfProduct, exampleProduct, exampleDateOfOrder, examplePaymentMethod);

    }

    public Order retrieve2() {

        User exampleBuyer = new User("rosa_daisy", "Róża", "Nowak", "Główna 15, 37-001 Poznań", 987654321, "roza.nowak@gmail.com");
        User exampleSeller = new User("kwiatuszek57", "Adam", "Kowalski", "Topolowa 15, 41-312 Wrocław", 951623847, "kwiat57@onet.pl");
        Product exampleProduct = new Product("Biurko", 1);
        LocalDateTime exampleDateOfOrder = LocalDateTime.of(2019, 12, 1, 21, 15, 56);
        Payment examplePaymentMethod = new Payment("Przelew");
        CategoryOfProduct exampleCategoryOfProduct = new CategoryOfProduct("Meble");

        return new Order(exampleBuyer, exampleSeller, exampleCategoryOfProduct, exampleProduct, exampleDateOfOrder, examplePaymentMethod);

    }
}
