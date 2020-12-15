package com.phoegel.interpreter.modify;

// 终结符类
public class ValueExpression extends AbstractExpression {
    private int value;

    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
