package com.kodilla.challenges.flights;

import java.util.HashMap;
import java.util.Map;

public final class FlightsTimetable {

    public static Map<Flight, Boolean> getMap(){
        final Map<Flight, Boolean> listOfFlights = new HashMap<>();
        listOfFlights.put(new Flight("Gdańsk", "Wrocław"), true);
        listOfFlights.put(new Flight("Gdańsk", "Warszawa"), true);
        listOfFlights.put(new Flight("Wrocław", "Warszawa"), true);
        listOfFlights.put(new Flight("Wrocław", "Gdańsk"), true);
        listOfFlights.put(new Flight("Warszawa", "Wrocław"), true);
        listOfFlights.put(new Flight("Warszawa", "Gdańsk"), true);

        return new HashMap<Flight, Boolean>(listOfFlights);
    }

}
