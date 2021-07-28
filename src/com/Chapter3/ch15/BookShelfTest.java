package com.Chapter3.ch15;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQue("토지1");
        bookQueue.enQue("토지2");
        bookQueue.enQue("토지3");
        bookQueue.enQue("토지4");
        bookQueue.enQue("토지5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQue());
        System.out.println(bookQueue.deQue());
        System.out.println(bookQueue.deQue());
        System.out.println(bookQueue.deQue());
        System.out.println(bookQueue.deQue());
    }
}
