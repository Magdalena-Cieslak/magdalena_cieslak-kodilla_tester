package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> result = new ArrayList<>();
        result.add(new Flight("Warszawa", "Rzeszów"));
        result.add(new Flight("Warszawa", "Gdańsk"));
        result.add(new Flight("Katowice", "Warszawa"));
        return result;
    }
}
