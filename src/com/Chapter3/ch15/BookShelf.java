package com.Chapter3.ch15;

public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
