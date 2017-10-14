package com.kodilla.challenges.delivery;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        System.out.println("Producer 1");
        OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShop());
        orderProcessor.creatingOrder(orderRequest);

        System.out.println("Producer 2");
        OrderProcessor orderProcessor1 = new OrderProcessor(new HealthyShop());
        orderProcessor1.creatingOrder(orderRequest);

        System.out.println("Producer 3");
        OrderProcessor orderProcessor2 = new OrderProcessor(new GlutenFreeShop());
        orderProcessor2.creatingOrder(orderRequest);


    }
}
