package com.phoegel.interpreter.analysis;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        String expressionStr = "1+2+3+4-5";
        Expression expression = parser.parseExpression(expressionStr);
        System.out.println(expressionStr + "=" + expression.getValue());
    }
}
