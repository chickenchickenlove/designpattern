package com.me.designpattern.behavioral_pattern.memento.after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // Memento 생성 -> 여기서 값을 숨김채로 저장함.
        GameSave save = game.save();

        game.setBlueTeamScore(20);
        game.setRedTeamScore(30);

        game.restore(save);

        System.out.printf("blue team : %d, read team : %d",
                game.getBlueTeamScore(),
                game.getRedTeamScore());
    }
}
