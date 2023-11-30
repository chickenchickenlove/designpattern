package com.me.designpattern.behavioral_pattern.template_method.after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
