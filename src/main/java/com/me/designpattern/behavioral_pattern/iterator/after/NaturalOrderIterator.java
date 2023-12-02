package com.me.designpattern.behavioral_pattern.iterator.after;

import java.util.Iterator;
import java.util.List;

public class NaturalOrderIterator implements Iterator<Post> {

    private final Iterator<Post> iterator;

    public NaturalOrderIterator(List<Post> posts) {
        this.iterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Post next() {
        return this.iterator.next();
    }
}
