package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jerry", "Springfield");
        Product product = new Product("Monopoly Board Game", 20.5);

        return new OrderRequest(user, product);
    }
}
