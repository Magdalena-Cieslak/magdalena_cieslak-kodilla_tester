package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {

    Map<String, String> library = new HashMap<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        library.put(title, author);

        for(Map.Entry<String, String> note : library.entrySet()) {
            System.out.println("Author: " + note.getValue() + ", Title: " + note.getKey());
        }
        return book;
    }
}

