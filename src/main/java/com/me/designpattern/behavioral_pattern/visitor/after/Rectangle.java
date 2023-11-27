package com.me.designpattern.behavioral_pattern.visitor.after;

public class Rectangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
