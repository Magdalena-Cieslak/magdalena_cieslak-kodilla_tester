package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplications {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Alaska", 3.0, 4.0, true));
        stamps.add(new Stamp("Koala", 2.5, 3.0, false));
        stamps.add(new Stamp("Alaska", 3.0, 4.0, true));
        stamps.add(new Stamp("Alaska", 3.0, 4.0, true));
        stamps.add(new Stamp("Cars", 1.0, 3.0, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);

        }
    }
}
