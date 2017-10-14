package com.kodilla.challenges.delivery;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        Vendor vendor1 = new Vendor("DHL");
        Product product1 = new Product("TOFU Bio", 1000);

        return new OrderRequest(vendor1, product1);
    }
}
