package com.kodilla.challenges.delivery;

public class Product {
    public final String name;
    public final int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

}
