package com.kodilla.good.patterns.challenges.onlineshop;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order1 = orderRetriever.retrieve1();
        Order order2 = orderRetriever.retrieve2();

        OrderProcessor orderProcessor1 = new OrderProcessor(new ProductOrderRepository(), new OrderServiceCashOnDelivery(), new InformationServiceSMS());
        OrderDto orderDto1 = orderProcessor1.process(order1);

        if (orderDto1.isSold()) {
            System.out.println(orderDto1.getBuyer().getNickName() + " dziękujemy za skorzystanie z naszego sklepu.\n :)\n\n");
        } else {
            System.out.println("Zamówienie nie może zostać skompletowane.\n\n\n");
        }

        OrderProcessor orderProcessor2 = new OrderProcessor(new ProductOrderRepository(), new OrderServiceCashOnDelivery(), new InformationServiceMail());
        OrderDto orderDto2 = orderProcessor2.process(order2);

        if (orderDto2.isSold()) {
            System.out.println(orderDto2.getBuyer().getNickName() + " dziękujemy za skorzystanie z naszego sklepu.\n :)\n\n");
        } else {
            System.out.println("Zamówienie nie może zostać skompletowane.\n\n\n");
        }
    }
}
