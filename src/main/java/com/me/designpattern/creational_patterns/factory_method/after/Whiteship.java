package com.me.designpattern.creational_patterns.factory_method.after;

public class Whiteship extends Ship{

    public Whiteship(String name) {
        setName(name);
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
