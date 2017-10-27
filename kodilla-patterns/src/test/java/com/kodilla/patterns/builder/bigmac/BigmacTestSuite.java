package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("without sesame")
                .burgers("two")
                .sauce("barbecue")
                .ingredient("becon")
                .ingredient("cheese")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("barbecue", whichSauce);

    }
}
