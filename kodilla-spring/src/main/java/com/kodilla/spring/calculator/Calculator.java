package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    public boolean add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return true;
    }

    public boolean sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return true;
    }

    public boolean mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return true;
    }
    public boolean div(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        return true;
    }

}
