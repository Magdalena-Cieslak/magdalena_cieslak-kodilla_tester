package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double valueA = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge().equals(user.getAge() >= 40))
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(valueA);

        double valueB = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge().equals(user.getAge() < 40))
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(valueB);
    }
}
