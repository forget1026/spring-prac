package com.example.ch23;

import com.example.ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for (Book book : library) {
            book.showInfo();
        }
    }
}
