package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderProcessor {
    private final OrderRepository orderRepository;
    private final OrderService orderService;
    private final InformationService informationService;

    public OrderProcessor(OrderRepository orderRepository, OrderService orderService, InformationService informationService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process(Order order) {
        boolean isSold = orderService.createOrder(order.getBuyer(), order.getSeller(), order.getCategoryOfProduct(), order.getProduct(), order.getDateOfOrder(), order.getPaymentMethod());

        if (isSold) {
            order.getBuyer().addOrderToHistoryOfOrders(order);
            order.getSeller().addOrderToHistoryOfOrders(order);
            informationService.informationAboutOrder(order.getBuyer());
            orderRepository.addOrderToRepository(order);
            return new OrderDto(order.getBuyer(), order.getSeller(), order.getCategoryOfProduct(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getBuyer(), order.getSeller(), order.getCategoryOfProduct(), order.getProduct(), false);
        }
    }
}
