package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.after;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
