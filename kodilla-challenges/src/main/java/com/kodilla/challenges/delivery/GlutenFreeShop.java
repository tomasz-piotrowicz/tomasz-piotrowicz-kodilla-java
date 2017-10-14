package com.kodilla.challenges.delivery;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println("Processing order for " + orderRequest.getVendor().getName() + ". " + orderRequest.getProduct().getAmount() + " " + orderRequest.getProduct().getName() +
                " will be delivered soon.");
        return  true;
    }
}
