package com.me.designpattern.behavioral_pattern.observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subject 역할을 하자.
public class ChatServer {

    private final Map<String, List<User>> subjects = new HashMap<>();

    public void subscribe(String subject, User user) {
        List<User> observers = this.subjects.getOrDefault(subject, new ArrayList<>());
        observers.add(user);
        subjects.put(subject, observers);
    }

    public void unsubscribe(String subject, User user) {
        if (this.subjects.containsKey(subject)) {
            List<User> users = this.subjects.get(subject);
            users.remove(user);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        this.subjects.getOrDefault(subject, new ArrayList<>())
                .forEach(u -> u.handleMessage(user, message));
    }
}
