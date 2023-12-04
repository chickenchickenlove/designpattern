package com.me.designpattern.behavioral_pattern.interpreter.after;

import java.util.Map;

public class PlusPostfixExpression implements PostfixExpression {

    private final PostfixExpression left;
    private final PostfixExpression right;

    public PlusPostfixExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return this.left.interpret(context) + this.right.interpret(context);
    }
}
