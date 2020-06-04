package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();
        Book book1 = book.createBook("Sky", "John Deep");
        Book book2 = book.createBook("Castle", "Jane Walls");
        Book book3 = book.createBook("Castle", "Jane Walls");


        System.out.println(book1 == book2);
        System.out.println(book2 == book3);

    }
}
