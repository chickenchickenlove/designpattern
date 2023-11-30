package com.me.designpattern.structural_pattern.composite.after;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return this.bag.getPrice();
    }
}
