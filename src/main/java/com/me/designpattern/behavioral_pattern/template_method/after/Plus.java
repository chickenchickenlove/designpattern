package com.me.designpattern.behavioral_pattern.template_method.after;

public class Plus extends FileProcessor{

    public Plus(String path) {
        super(path);
    }

    @Override
    protected int doProcess(int result, String line) {
        result += Integer.parseInt(line);
        return result;
    }
}
