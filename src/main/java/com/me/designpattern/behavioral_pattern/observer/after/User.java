package com.me.designpattern.behavioral_pattern.observer.after;

// Pub + Sub 역할을 모두 다 함.
// 여기서는 Subscriber 인터페이스 필요없음.
// User의 이름을 참조할 것인데, Subscribe 인터페이스 자체가 name을 가지지 않기 때문에 getName()을 인터페이스로 제공하기 애매함.
public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void handleMessage(User user, String message) {
        System.out.printf(
                "User: %s, Message: %s",
                user.getName(),
                message);
    }

    private String getName() {
        return this.name; }
}
