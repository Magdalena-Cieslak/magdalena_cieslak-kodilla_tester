package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    private Map<List<Flight>, List<Flight>> towns = new HashMap<>();

    public List<Flight> findFlightFrom (String departure) {
        return towns.get(departure);
    }

    public List<Flight> findFlightsTo (String arrival) {
        return towns.get(arrival);
    }
}
