package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("logging!");
        super.handler(request);
    }
}
