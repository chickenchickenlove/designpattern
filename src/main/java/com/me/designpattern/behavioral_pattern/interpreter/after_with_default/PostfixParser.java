package com.me.designpattern.behavioral_pattern.interpreter.after_with_default;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            PostfixExpression postExpression = getExpression(c, stack);
            stack.push(postExpression);
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return PostfixExpression.plus(stack.pop(), stack.pop());
            }
            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return PostfixExpression.minus(left, right);
            }
            default -> {
                return PostfixExpression.variable(c);
            }
        }
    }
}
