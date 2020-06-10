package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, String> towns = new HashMap<>();

    public List<Flight> findFlightFrom (String departure) {
        for(Map.Entry<String, String> note : towns.entrySet()) {
            if(note.equals(departure)){
                towns.get(note);
            }
            System.out.println("Lot na trasie: " + departure + " - " + note);
        }
    }
}
