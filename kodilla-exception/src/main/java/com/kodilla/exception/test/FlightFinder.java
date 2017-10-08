package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put(flight.getArrivalAirport(), false);
        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            if (entry.getValue() == false) {
                throw new RouteNotFoundException("Airport doesn't exist!");
            }
        }
    }

}
