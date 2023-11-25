package com.me.designpattern.behavioral_pattern.memento.after;

// Memento
// Memento는 불변 객체여야함.
// Memento 객체를 통해 상태의 캡슐화를 유지함.
public final class GameSave {
    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
}
