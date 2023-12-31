package com.me.designpattern.behavioral_pattern.interpreter.after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
