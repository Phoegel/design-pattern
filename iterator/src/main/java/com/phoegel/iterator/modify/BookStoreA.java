package com.phoegel.iterator.modify;

/**
 * A 书店内部使用数组存储书籍
 */
public class BookStoreA implements Aggregate {
    private Book[] books;

    private int index;

    public BookStoreA() {
        books = new Book[10];
    }

    // 添加书籍
    public void addBook(Book book) {
        if (index == books.length) {
            throw new IndexOutOfBoundsException("容量不足");
        }
        books[index] = book;
        index++;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public Iterator createIterator() {
        return new BookStoreAIterator(this);
    }
}
