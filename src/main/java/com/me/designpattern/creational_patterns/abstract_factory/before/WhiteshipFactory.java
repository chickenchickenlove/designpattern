package com.me.designpattern.creational_patterns.abstract_factory.before;

public class WhiteshipFactory {

    public Ship createShip() {
        Ship ship = new Ship();
        ship.setWhiteAnchor(new WhiteAnchor());
        ship.setWhiteWheel(new WhiteWheel());
        return ship;
    }
}
