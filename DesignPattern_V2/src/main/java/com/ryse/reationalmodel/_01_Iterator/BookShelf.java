package com.ryse.reationalmodel._01_Iterator;

public class BookShelf implements  Aggregate{
    private Book[] books;
    private int last;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public boolean appendBook(Book book) {
        if (last == books.length - 1) return false;
        books[last++] = book;
        return true;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
