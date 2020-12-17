package com.phoegel.iterator.modify;

/**
 * 具体迭代器，针对链表形式重写 hasNext()、next() 等方法
 */
public class BookStoreBIterator implements Iterator {
    private BookStoreB bookStoreB;
    private BookStoreB.Node<Book> node;

    public BookStoreBIterator(BookStoreB bookStoreB) {
        this.bookStoreB = bookStoreB;
        this.node = new BookStoreB.Node<>(null, bookStoreB.getFirst());
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = this.node.next != null;
        this.node = this.node.next;
        return hasNext;
    }

    @Override
    public Book next() {
        return node.book;
    }
}
