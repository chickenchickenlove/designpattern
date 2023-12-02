package com.me.designpattern.behavioral_pattern.mediator.after;

import lombok.Getter;

@Getter
public class Guest {
    private final Long id;
    private final FrontDesk frontDesk;

    public Guest(Long id, FrontDesk frontDesk) {
        this.id = id;
        this.frontDesk = frontDesk;
    }

    public void dinner() {
        frontDesk.dinner(this);
    }

    public void getTower(int numberOfTower) {
        frontDesk.getTower(this, numberOfTower);
    }

}
