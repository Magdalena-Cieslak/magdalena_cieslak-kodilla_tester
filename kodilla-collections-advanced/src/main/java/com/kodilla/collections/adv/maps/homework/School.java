package com.kodilla.collections.adv.maps.homework;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> students = new ArrayList<>();

    public School(List<Double> students) {
        this.students = students;
    }

    public int getSumOfStudent() {
        int sum = 0;
        for (Double student : students)
        sum += student;
        return sum;
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

}
