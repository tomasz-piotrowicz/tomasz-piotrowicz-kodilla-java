package com.kodilla.exception.test;

public class RouteExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("London", "Utah");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thank you for using our Flight Finder site");
        }
    }
}
