package com.me.designpattern.creational_patterns.abstract_factory.after;

public class WhiteProPartsFactory implements PartsFactory {


    @Override
    public Anchor getAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel getWheel() {
        return new WhiteWheelPro();
    }
}
