package com.phoegel.interpreter.modify;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression = "1+2+3+4-5";
        calculator.parse(expression);
        System.out.println(expression + "=" + calculator.calculate());
    }
}
