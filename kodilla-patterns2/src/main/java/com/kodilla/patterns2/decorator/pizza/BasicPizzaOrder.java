package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCosts() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Order margharita(tomato sauce, cheese)";
    }
}
