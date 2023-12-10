package com.me.designpattern.creational_patterns.abstract_factory.after;

public class WhitePartsFactory implements PartsFactory {

    @Override
    public Anchor getAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel getWheel() {
        return new WhiteWheel();
    }
}
