package com.me.designpattern.behavioral_pattern.visitor.before;

public interface Shape {

//    void printTo(Device device);

    void printTo(Watch watch);

    void printTo(Phone phone);
}
