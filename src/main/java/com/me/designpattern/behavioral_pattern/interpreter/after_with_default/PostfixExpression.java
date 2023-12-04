package com.me.designpattern.behavioral_pattern.interpreter.after_with_default;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);

    public static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    public static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    public static PostfixExpression variable(Character c) {
        return context -> context.get(c);
    }

}
