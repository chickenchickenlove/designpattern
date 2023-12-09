package com.me.designpattern.behavioral_pattern.visitor.after_retry;

public class Triangle implements Shape {

    @Override
    public void printTo(Device device) {
        device.print(this);
    }

}
