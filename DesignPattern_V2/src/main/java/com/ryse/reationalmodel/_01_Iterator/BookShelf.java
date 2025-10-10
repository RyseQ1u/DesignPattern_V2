package com.ryse.reationalmodel._01_Iterator;

import java.util.ArrayList;

public class BookShelf implements  Aggregate{
//    private Book[] books;
    private ArrayList<Book> books;
    private int last;

    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public boolean appendBook(Book book) {
        books.add(book);
        return true;
    }

    public int getLength(){
//        return last;
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
