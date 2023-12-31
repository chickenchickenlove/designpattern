package com.me.designpattern.structural_pattern.proxy.after_interface;


public class GameServiceProxy implements GameService {

    private final GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long start = System.currentTimeMillis();
        gameService.startGame();
        System.out.println("걸린 시간 = " + (System.currentTimeMillis() - start));
    }

}
