package com.phoegel.iterator.analysis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("A Book"));
        bookList.add(new Book("B Book"));
        bookList.add(new Book("C Book"));
        bookList.add(new Book("D Book"));

        // 迭代器遍历
        Iterator<Book> bookIterator = bookList.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}
