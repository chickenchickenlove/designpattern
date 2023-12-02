package com.me.designpattern.behavioral_pattern.command.after.command;

import com.me.designpattern.behavioral_pattern.command.after.Game;

public class GameStartCommand implements Command {

    private final Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
