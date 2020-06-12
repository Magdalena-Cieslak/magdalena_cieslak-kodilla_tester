package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().equals(currentDate))
                .map(dd -> dd.getName())
                .forEach(dd -> System.out.println(dd));
    }
}
