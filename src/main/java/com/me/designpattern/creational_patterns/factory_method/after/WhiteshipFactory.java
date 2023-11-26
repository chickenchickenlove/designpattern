package com.me.designpattern.creational_patterns.factory_method.after;

public class WhiteshipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        return new Whiteship(name);
    }
}
