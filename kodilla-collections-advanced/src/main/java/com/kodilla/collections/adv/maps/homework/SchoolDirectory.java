package com.kodilla.collections.adv.maps.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal john = new Principal("John", "Jefferson");
        Principal tom = new Principal("Tom", "Red");
        Principal anna = new Principal("Anna", "Thompson");

        School schoolNuberEleven = new School(Collections.singletonList(200.0));
        School schoolOfAngels = new School(Collections.singletonList(157.0));
        School schoolNumberThree = new School(Collections.singletonList(290.0));

        schools.put(john, schoolNuberEleven);
        schools.put(tom, schoolOfAngels);
        schools.put(anna, schoolNumberThree);

        for (Map.Entry<Principal, School> principalSchoolEntry : schools.entrySet()) {
            System.out.println((principalSchoolEntry.getKey().getFirstname() +
                    ", sum of students is: : " +
                    principalSchoolEntry.getValue().getSumOfStudent()));

        }
    }
}
