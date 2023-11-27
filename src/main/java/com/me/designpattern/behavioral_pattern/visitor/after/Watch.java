package com.me.designpattern.behavioral_pattern.visitor.after;

public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to Watch");
    }
}