package com.me.designpattern.behavioral_pattern.mediator.after;

public class FrontDesk {

    private final CleaningService cleaningService;
    private final Restaurant restaurant;

    public FrontDesk(CleaningService cleaningService, Restaurant restaurant) {
        this.cleaningService = cleaningService;
        this.restaurant = restaurant;
    }

    public void getTower(Guest guest, int numberOfTower) {
        cleaningService.getTower(guest.getId(), numberOfTower);
    }

    public void dinner(Guest guest) {
        restaurant.dinner(guest.getId());
    }

    public void clean(Restaurant restaurant) {
        cleaningService.clean(restaurant.getRestaurantId());
    }
}
