package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate opened_1 = LocalDate.of(2020, 05, 20);
        LocalDate deadline_1 = LocalDate.of(2020, 05,25);
        LocalDate opened_2 = LocalDate.of(2020, 05, 25);
        LocalDate deadline_2 = LocalDate.of(2020, 06,15);
        LocalDate opened_3 = LocalDate.of(2020, 06, 15);
        LocalDate deadline_3 = LocalDate.of(2020, 06,25);

        tasks.add(new Task("Search", opened_1, deadline_1 ));
        tasks.add(new Task("Order", opened_2, deadline_2 ));
        tasks.add(new Task("Buy", opened_3, deadline_3 ));

        return tasks;
    }
}
