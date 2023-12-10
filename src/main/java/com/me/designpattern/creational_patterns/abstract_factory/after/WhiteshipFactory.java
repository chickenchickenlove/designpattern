package com.me.designpattern.creational_patterns.abstract_factory.after;


public class WhiteshipFactory {

    private final PartsFactory partsFactory;

    public WhiteshipFactory(PartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(this.partsFactory.getAnchor());
        ship.setWheel(this.partsFactory.getWheel());
        return ship;
    }
}
