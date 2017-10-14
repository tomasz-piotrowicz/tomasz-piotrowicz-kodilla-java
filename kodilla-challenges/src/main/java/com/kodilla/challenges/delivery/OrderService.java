package com.kodilla.challenges.delivery;

public class OrderService {
    public boolean order(Vendor vendor, Product product){
        System.out.println("Order has been sent to " + vendor.name + "\n" + "Your order: " + product.amount + "x " + product.name);
        return  true;
    }
}
