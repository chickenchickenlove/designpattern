package com.me.designpattern.behavioral_pattern.template_method.after;

public class Multiply extends FileProcessor{
    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int doProcess(int result, String line) {
        result *= Integer.parseInt(line);
        return result;
    }
}
