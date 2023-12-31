package com.me.designpattern.creational_patterns.factory_method.after;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new Blackship(name);
    }
}
