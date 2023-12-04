package com.me.designpattern.behavioral_pattern.interpreter.after;

import java.util.Map;

public class VariablePostfixExpression implements PostfixExpression {

    private final Character character;

    public VariablePostfixExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
