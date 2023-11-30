package com.me.designpattern.behavioral_pattern.strategy.after;

public class Fast implements Speed {

    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("피어씀다");
    }
}
