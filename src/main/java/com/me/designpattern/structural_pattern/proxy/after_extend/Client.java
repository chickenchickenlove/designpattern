package com.me.designpattern.structural_pattern.proxy.after_extend;

// 만약에 걸린 시간을 확인하는 기능을 추가하고 싶다면..?
public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService target = new GameService();
        GameService gameService = new GameServiceProxy(target);
        gameService.startGame();
    }
}

