package com.phoegel.memento.typical;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        Memento memento = caretaker.getMemento();
    }
}
