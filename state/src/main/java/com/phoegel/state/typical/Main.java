package com.phoegel.state.typical;

public class Main {
    public static void main(String[] args) {
        State state = new ConcreteState();
        Context context = new Context();
        context.setState(state);
        context.request();
    }
}
