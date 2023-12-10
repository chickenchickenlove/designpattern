package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.after;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println("can auth?");
        System.out.println("can use this handler?");
        super.handle(request);
    }
}
