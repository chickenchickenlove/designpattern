package com.me.designpattern.behavioral_pattern.interpreter.after;

import java.util.Map;

public class MinusPostfixExpression implements PostfixExpression {

    private final PostfixExpression left;
    private final PostfixExpression right;

    public MinusPostfixExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return this.left.interpret(context) - this.right.interpret(context);
    }
}
