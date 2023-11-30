package com.me.designpattern.behavioral_pattern.strategy.after;

public class BlueLightRedLight {
    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}