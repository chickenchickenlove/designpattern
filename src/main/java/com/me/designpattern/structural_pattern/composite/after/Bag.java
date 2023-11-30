package com.me.designpattern.structural_pattern.composite.after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Composite으로 동작
public class Bag implements Component {

    private final List<Component> items = new ArrayList<>();


    public void add(Component item) {
        this.items.add(item);
    }

    @Override
    public int getPrice() {
        return this.items.stream()
                .mapToInt(Component::getPrice)
                .sum();
    }
}
