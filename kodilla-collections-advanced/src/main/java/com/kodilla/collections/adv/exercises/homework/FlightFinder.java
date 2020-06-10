package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    List<Flight> flights = new FlightRepository().getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        for(Flight flight : flights) {
            if(flight.getDeparture().equals(departure)) {
                flights.add(flight);
            }
        }
        return flights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        for(Flight flight : flights) {
            if(flight.getArrival().equals(arrival)) {
                flights.add(flight);
            }
        }
        return flights;
    }
}
