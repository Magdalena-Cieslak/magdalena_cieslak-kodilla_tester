package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> deadlinesDate = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().equals(LocalDate.now()))
                .map(dd -> dd.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlinesDate);
    }
}
