package com.me.designpattern.behavioral_pattern.template_method.after_template_callback;


public class Client {
    public static void main(String[] args) {
        // Template Callback 패턴
        Operator multiPly = new MultiPly();
        FileProcessor fileProcessor = new FileProcessor("number.txt", multiPly);
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
