package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DeliveryDecorator extends AbstractPizzaOrderDecorator {
    public DeliveryDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + order takeaway";
    }
}
