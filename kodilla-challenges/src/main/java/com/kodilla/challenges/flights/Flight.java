package com.kodilla.challenges.flights;

public class Flight {
    private  final String departureAirport;
    private final String arrivalAirport;

    public Flight(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return departureAirport + " - " + arrivalAirport;

    }
}
