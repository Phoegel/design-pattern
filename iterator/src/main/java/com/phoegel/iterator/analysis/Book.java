package com.phoegel.iterator.analysis;

/**
 * 书籍类
 */
public class Book {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
