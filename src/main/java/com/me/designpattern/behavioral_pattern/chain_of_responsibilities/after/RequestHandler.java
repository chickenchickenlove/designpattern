package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.after;

public abstract class RequestHandler {

    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handle(Request request) {
        if (this.next != null) {
            this.next.handle(request);
        }
    }

}
