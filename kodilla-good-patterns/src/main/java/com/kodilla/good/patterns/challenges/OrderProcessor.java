package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrdered){
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
