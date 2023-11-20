package com.me.designpattern.factory_method.after;

public interface ShipFactory {

    Ship createShip(String name);

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip(name);

        // notify
        sendEmailTo(email, ship);
        return ship;
    }

    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
