package com.me.designpattern.behavioral_pattern.iterator.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }

    public Iterator<Post> getNaturalOrderIterator() {
        return new NaturalOrderIterator(this.posts);
    }
}
