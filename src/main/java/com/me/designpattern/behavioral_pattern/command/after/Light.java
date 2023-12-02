package com.me.designpattern.behavioral_pattern.command.after;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("Turn on light.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("Turn off light");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
