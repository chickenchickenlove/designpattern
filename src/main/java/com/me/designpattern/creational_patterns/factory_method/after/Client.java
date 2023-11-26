package com.me.designpattern.creational_patterns.factory_method.after;

/**
 * Client의 코드는 바뀌게 됨. 기본 Factory 메서드에서 변경되기 때문임.
 * 이 관점에서는 OCP가 아닌 것은 맞음. 이 부분을 해결하기 위해서 DI를 이용함.
 * 다만 Whiteship, BlackShip 등에 대한 기능을 추가할 때 기존 Whiteship, Blackship에 대한 코드는 손대지 않음. (OCP)
 */

public class Client {

    public static void main(String[] args) {
        // 이 코드는 바뀌게 됨.
        //com.me.designpattern.factory_method.before.Ship whiteship = com.me.designpattern.factory_method.before.ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        Ship whiteship = new WhiteshipFactory().createShip("white");
        System.out.println(whiteship);

        // 이 코드는 바뀌게 됨.
        // Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        Ship blackship = new BlackshipFactory().createShip("black");
        System.out.println(blackship);
    }

}