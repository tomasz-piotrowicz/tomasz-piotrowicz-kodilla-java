package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator(60, 30);

        int result = simpleCalculator.add(60, 30);
        int result1 = simpleCalculator.substract(60, 30);

        if (result == 90){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result1 == 30){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
