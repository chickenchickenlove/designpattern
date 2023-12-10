package com.me.designpattern.behavioral_pattern.chain_of_responsibilities.before;

// 만약에 AuthRequestHandler까지 같이 연계해서 사용하고 싶다면..?
public class Client {

    public static void main(String[] args) {
        Request request = new Request("bloom moo-goon-wha.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
