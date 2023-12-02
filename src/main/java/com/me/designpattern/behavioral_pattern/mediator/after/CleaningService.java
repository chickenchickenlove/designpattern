package com.me.designpattern.behavioral_pattern.mediator.after;


public class CleaningService {

    public void getTower(Long guestId, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + roomNumber(guestId));
    }

    public void clean(Long restaurantId) {
        System.out.println("clean " + restaurantName(restaurantId));
    }

    private String roomNumber(Long guestId) {
        return "1111";
    }

    private String restaurantName(Long restaurantId) {
        return "Chinese Food";
    }
}
