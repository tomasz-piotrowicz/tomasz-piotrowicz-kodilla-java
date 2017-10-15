package com.kodilla.challenges.flights;

public class FlightsFinder {
    public static void main(String[] args){

        System.out.println("All flight form departure airport");
        FlightsTimetable.getMap().entrySet().stream()
                .filter(entry -> entry.getKey().getDepartureAirport().equals("Gdańsk"))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);

        System.out.println("All flight by arrival airport");
        FlightsTimetable.getMap().entrySet().stream()
                .filter(entry -> entry.getKey().getArrivalAirport().equals("Warszawa"))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);

        System.out.println("All flight by another arrival airport");
        FlightsTimetable.getMap().entrySet().stream()
                .filter(entry -> entry.getKey().getDepartureAirport().equals("Gdańsk") && entry.getKey().getArrivalAirport().equals("Wrocław"))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);
        FlightsTimetable.getMap().entrySet().stream()
                .filter(entry -> entry.getKey().getDepartureAirport().equals("Wrocław") && entry.getKey().getArrivalAirport().equals("Warszawa"))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);


    }
}
