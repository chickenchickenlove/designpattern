package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.after;


public class Client {

    public void doSomething(RequestHandler requestHandler){
        Request request = new Request("bloom moo-goon-wha.");
        requestHandler.handle(request);

    }

    public static void main(String[] args) {
        RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client();
        client.doSomething(handler);
    }
}
