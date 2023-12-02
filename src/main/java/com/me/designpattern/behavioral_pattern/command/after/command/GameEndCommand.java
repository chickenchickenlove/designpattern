package com.me.designpattern.behavioral_pattern.command.after.command;

import com.me.designpattern.behavioral_pattern.command.after.Game;

public class GameEndCommand implements Command {

    private final Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
