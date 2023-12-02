package com.me.designpattern.behavioral_pattern.command.after.command;

import com.me.designpattern.behavioral_pattern.command.after.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
