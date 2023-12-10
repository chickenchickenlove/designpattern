package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.before;

public class AuthRequestHandler extends RequestHandler {

    public void handler(Request request) {
        System.out.println("can auth?");
        System.out.println("can use this handler?");
        super.handler(request);
    }
}