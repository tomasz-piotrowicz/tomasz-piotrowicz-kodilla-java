package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraIngredientDecorator extends AbstractPizzaOrderDecorator {
    public ExtraIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCosts() {
        return super.getCosts().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 1 extra ingredient to choose";
    }
}
