package com.ryse.designpattern._01_Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        bookShelf.appendBook(new Book("Book3"));
        bookShelf.appendBook(new Book("Book4"));
        //修改了集合类型
        bookShelf.appendBook(new Book("Book5"));
        bookShelf.appendBook(new Book("Book6"));
        bookShelf.appendBook(new Book("Book7"));
        bookShelf.appendBook(new Book("Book8"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
