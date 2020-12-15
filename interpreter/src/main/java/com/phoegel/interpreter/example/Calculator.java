package com.phoegel.interpreter.example;

import java.util.Stack;

public class Calculator {
    public int calculate(String expression) {
        String[] expressionArray = expression.split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expressionArray.length; i++) {
            if ("+".equals(expressionArray[i])) {
                // 如果是 + 号，则再取下一个数累加后放入栈中
                Integer num = stack.pop();
                stack.push(num + Integer.valueOf(expressionArray[++i]));
            } else if ("-".equals(expressionArray[i])) {
                // 如果是 - 号，也是再取下一个数相减后放入栈中
                Integer num = stack.pop();
                stack.push(num - Integer.valueOf(expressionArray[++i]));
            } else {
                // 数字直接放入栈中
                stack.push(Integer.valueOf(expressionArray[i]));
            }
        }
        return stack.pop();
    }
}
