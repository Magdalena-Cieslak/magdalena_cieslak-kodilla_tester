package com.kodilla.collections.adv.immutable.special.homework;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class BookManager {

    Map<Book, Book> library = new HashMap<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        for (Map.Entry<Book, Book> note : library.entrySet()) {
            if ((library.get(title)).equals(book.getAuthor())) {
                return book;
            } else {
                library.put(book.getTitle(), book.getAuthor());
            }
        }
        return book;
    }
}

