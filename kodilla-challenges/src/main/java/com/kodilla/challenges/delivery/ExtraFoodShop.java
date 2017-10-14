package com.kodilla.challenges.delivery;

public class ExtraFoodShop implements Producer{

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println("Order has been sent to " + orderRequest.getVendor().getName() + "\n" + "Your order: " + orderRequest.getProduct().getAmount() + " " + orderRequest.getProduct().getName() + ".");
        return  true;
    }
}
