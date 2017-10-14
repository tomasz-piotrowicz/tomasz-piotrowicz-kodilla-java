package com.kodilla.challenges.delivery;

public class HealthyShop implements Producer {

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println("We got your order! " + orderRequest.getProduct().getAmount() + " " + orderRequest.getProduct().getName() +
                " will be sent to " + orderRequest.getVendor().getName());
        return  true;
    }
}
