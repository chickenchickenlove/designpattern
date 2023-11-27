package com.me.designpattern.behavioral_pattern.visitor.after;

public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to phone");
    }
}
