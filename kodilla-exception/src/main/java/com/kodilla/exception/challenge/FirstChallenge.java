package com.kodilla.exception.challenge;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException a) {
            System.out.println(a);

        } finally {
            System.out.println("If the division didn't work you entered a bad data..");
        }

    }

}
