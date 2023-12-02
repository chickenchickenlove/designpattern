package com.me.designpattern.behavioral_pattern.command.after.command;

import com.me.designpattern.behavioral_pattern.command.after.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
