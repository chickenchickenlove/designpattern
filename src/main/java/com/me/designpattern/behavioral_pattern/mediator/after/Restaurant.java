package com.me.designpattern.behavioral_pattern.mediator.after;


import lombok.Getter;

@Getter
public class Restaurant {

    private final Long restaurantId;
    private final FrontDesk frontDesk;

    public Restaurant(Long restaurantId, FrontDesk frontDesk) {
        this.restaurantId = restaurantId;
        this.frontDesk = frontDesk;
    }

    public void dinner(Long guestId) {
        System.out.println("dinner " + guestId);
    }

    public void clean() {
        frontDesk.clean(this);
    }
}
