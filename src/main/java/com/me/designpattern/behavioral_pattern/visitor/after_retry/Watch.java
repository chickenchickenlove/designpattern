package com.me.designpattern.behavioral_pattern.visitor.after_retry;

public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print circle Watch.");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle Watch.");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle Watch.");
    }
}