package com.phoegel.iterator.example;

public class Main {
    public static void main(String[] args) {
        BookStoreA bookStoreA = new BookStoreA();
        bookStoreA.addBook(new Book("A Book"));
        bookStoreA.addBook(new Book("B Book"));
        bookStoreA.addBook(new Book("C Book"));
        bookStoreA.addBook(new Book("D Book"));
        // 遍历书籍
        Book[] books = bookStoreA.getBooks();
        for (int i = 0; i < bookStoreA.getIndex(); i++) {
            System.out.println(books[i]);
        }

        System.out.println("--------------------------");

        BookStoreB bookStoreB = new BookStoreB();
        bookStoreB.addBook(new Book("A Book"));
        bookStoreB.addBook(new Book("B Book"));
        bookStoreB.addBook(new Book("C Book"));
        bookStoreB.addBook(new Book("D Book"));
        // 遍历书籍
        BookStoreB.Node<Book> first = bookStoreB.getFirst();
        while (first != null) {
            System.out.println(first.book);
            first = first.next;
        }
    }
}
