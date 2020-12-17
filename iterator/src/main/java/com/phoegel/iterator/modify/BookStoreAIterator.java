package com.phoegel.iterator.modify;

/**
 * 具体迭代器，针对数组形式重写 hasNext()、next() 等方法
 */
public class BookStoreAIterator implements Iterator {
    private BookStoreA bookStoreA;
    private int index;

    public BookStoreAIterator(BookStoreA bookStoreA) {
        this.bookStoreA = bookStoreA;
    }

    @Override
    public boolean hasNext() {
        return this.index < bookStoreA.getIndex();
    }

    @Override
    public Book next() {
        return bookStoreA.getBooks()[this.index++];
    }
}
