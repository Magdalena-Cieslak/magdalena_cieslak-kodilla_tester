package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Sky", "John Deep");
        Book book2 = bookManager.createBook("Castle", "Jane Walls");
        Book book3 = bookManager.createBook("Castle", "Jane Walls");


        System.out.println(book1 == book2);
        System.out.println(book2 == book3);

    }
}
