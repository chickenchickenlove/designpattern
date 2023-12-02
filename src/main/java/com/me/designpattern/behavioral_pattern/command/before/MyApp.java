package com.me.designpattern.behavioral_pattern.command.before;

public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        this.game.start();
        // 버튼 인터페이스로 게임을 시작 / 종료를 하고 싶은데.. 그렇다면 그 때 마다 메서드를 수정해야 함.
        // this.game.end();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new Game());
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }
}
