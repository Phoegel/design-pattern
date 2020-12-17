package com.phoegel.iterator.modify;

public class Main {
    public static void main(String[] args) {
        BookStoreA bookStoreA = new BookStoreA();
        bookStoreA.addBook(new Book("A Book"));
        bookStoreA.addBook(new Book("B Book"));
        bookStoreA.addBook(new Book("C Book"));
        bookStoreA.addBook(new Book("D Book"));

        // 使用迭代器进行统一遍历
        Iterator bookStoreAIterator = bookStoreA.createIterator();
        while (bookStoreAIterator.hasNext()) {
            System.out.println(bookStoreAIterator.next());
        }
        System.out.println("---------------------------");
        BookStoreB bookStoreB = new BookStoreB();
        bookStoreB.addBook(new Book("A Book"));
        bookStoreB.addBook(new Book("B Book"));
        bookStoreB.addBook(new Book("C Book"));
        bookStoreB.addBook(new Book("D Book"));

        // 使用迭代器进行统一遍历
        Iterator bookStoreBIterator = bookStoreB.createIterator();
        while (bookStoreBIterator.hasNext()) {
            System.out.println(bookStoreBIterator.next());
        }
    }
}
