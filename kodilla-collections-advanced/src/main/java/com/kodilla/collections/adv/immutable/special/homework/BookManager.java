package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {

    private Map<Book, Book> library = new HashMap<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        if (library.get(book) == null) {
            library.put(book, book);
        }
        return library.get(book);
    }
}

