package com.me.designpattern.behavioral_pattern.strategy.after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();

        Normal normal = new Normal();
        Fast fast = new Fast();

        blueLightRedLight.redLight(normal);
        blueLightRedLight.blueLight(fast);

    }
}
