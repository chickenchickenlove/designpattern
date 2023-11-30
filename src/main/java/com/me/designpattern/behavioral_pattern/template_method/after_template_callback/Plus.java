package com.me.designpattern.behavioral_pattern.template_method.after_template_callback;

public class Plus implements Operator {
    @Override
    public int doProcess(int result, String line) {
        result += Integer.parseInt(line);
        return result;
    }
}
