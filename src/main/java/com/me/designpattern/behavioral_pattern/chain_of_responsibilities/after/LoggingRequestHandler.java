package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.after;

public class LoggingRequestHandler extends RequestHandler {
    public LoggingRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println("logging");
        super.handle(request);
    }
}
