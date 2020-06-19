package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Majkowska", null));
        students.add(new Student("Beata Czajka", new Teacher("Paweł Wojtyła")));
        students.add(new Student("Tomek Lach", new Teacher("Wiesław Guzek")));
        students.add(new Student("Michał Nowak", null));

        for (Student student : students)
            System.out.println("Uczeń: " + student.getName() + ", Nauczyciel: "
                    + student.getTeacher().getName());

        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("Undefined");
    }
}

