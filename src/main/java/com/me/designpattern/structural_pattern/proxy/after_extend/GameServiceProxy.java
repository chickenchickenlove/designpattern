package com.me.designpattern.structural_pattern.proxy.after_extend;


public class GameServiceProxy extends GameService {

    private final GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long start = System.currentTimeMillis();
        gameService.startGame();
        // super.startGame();
        System.out.println("걸린 시간 = " + (System.currentTimeMillis() - start));
    }

}
