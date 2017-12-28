package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicOrdergetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCosts();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order margharita(tomato sauce, cheese)", description);
    }

    @Test
    public void testPizzaOrderWithExtraIngredientThinCrustGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new CrustDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCosts();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithExtraIngredientThinCrustGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new CrustDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order margharita(tomato sauce, cheese) + 1 extra ingredient to choose + thin crust", description);
    }

    @Test
    public void testExtraIngredientThinCrustDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new CrustDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCosts();
        //Then
        assertEquals(new BigDecimal(24),calculatedCost);
    }

    @Test
    public void testExtraIngredientThinCrustDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new CrustDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order margharita(tomato sauce, cheese) + 1 extra ingredient to choose + thin crust + order takeaway", description);
    }

}
