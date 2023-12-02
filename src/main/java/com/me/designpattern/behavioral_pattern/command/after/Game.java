package com.me.designpattern.behavioral_pattern.command.after;

public class Game {

    private boolean isStarted;

    public void start() {
        System.out.println("Start Game");
        this.isStarted = true;
    }

    public void end() {
        System.out.println("End Game");
        this.isStarted = false;
    }

    public boolean isStarted() {
        return this.isStarted;
    }
}