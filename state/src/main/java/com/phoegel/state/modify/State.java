package com.phoegel.state.modify;

public abstract class State {
    public abstract String getName();

    protected abstract void changeCards();

    protected abstract int score(int integral);
}
