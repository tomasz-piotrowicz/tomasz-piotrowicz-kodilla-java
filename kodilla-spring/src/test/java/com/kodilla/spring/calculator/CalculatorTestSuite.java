package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(10, 2);
        double result2 = calculator.div(10, 2);
        double result3 = calculator.mul(10, 2);
        double result4 = calculator.sub(10,2);
        //Then
        Assert.assertEquals(12.0,result1, 0.1);
        Assert.assertEquals(8.0, result4, 0.1);
        Assert.assertEquals(20.0, result3, 0.1);
        Assert.assertEquals(5.0, result2, 0.1);
    }
}
