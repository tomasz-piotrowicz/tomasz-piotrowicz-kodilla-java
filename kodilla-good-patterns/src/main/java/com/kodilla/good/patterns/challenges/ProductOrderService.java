package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product){
        System.out.println("Order has been processed" + "\n"
                + user.getName() + " " + user.getSurname() + " has ordered " + product.getName() + " for " + product.getPrice() + "$.");
        return true;
    }
}
