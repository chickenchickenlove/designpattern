package com.me.designpattern.behavioral_pattern.observer.after;


public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("hello1");
        User user2 = new User("hello2");

        chatServer.subscribe("디자인패턴", user2);
        chatServer.sendMessage(user1, "디자인패턴", "이번엔 옵저버 패턴입니다.");
    }
}
