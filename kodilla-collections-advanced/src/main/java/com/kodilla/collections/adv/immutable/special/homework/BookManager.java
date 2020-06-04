package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {

    public Book createBook(String title, String author) {
        Map<Book, String> library = new HashMap<>();
        Book book = new Book();

        library.put(book, "Sky. John Deep");
        library.put(book, "Castle. Jane Walls");
        library.put(book, "Castle. Jane Walls");

        for (Map.Entry<Book, String> books : library.entrySet()) {
            System.out.println(library.entrySet());
        }
        return (Book) library.entrySet();


    }
}
