package com.phoegel.iterator.example;

/**
 * B 书店内部使用链表存储书籍
 */
public class BookStoreB {
    // 记录第一个节点
    private Node<Book> first;
    // 记录最后一个节点
    private Node<Book> last;

    public void addBook(Book book) {
        Node<Book> node = new Node<>(book, null);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    /**
     * 实际存放数据及结构的内部类
     * @param <Book>
     */
    static class Node<Book> {
        // 存放数据
        Book book;
        // 存放/指向下一个节点
        Node<Book> next;

        Node(Book book, Node<Book> next) {
            this.book = book;
            this.next = next;
        }
    }

    public Node<Book> getFirst() {
        return first;
    }
}
