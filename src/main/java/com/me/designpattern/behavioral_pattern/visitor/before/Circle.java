package com.me.designpattern.behavioral_pattern.visitor.before;

// 현재 기준에서는 다음 문제가 있음.
// 1. Shape에 새로운 구현체가 추가되면 Device 개수만큼 if ~ else문이 추가되어야 함.
// 2. Device 구현체가 새로 추가되면, 모든 Shape에 그것이 추가되어야 함.
// 3. 하나의 변경에 너무 많은 영향을 받음....
// 4. 그리고 If / Else 문을 추가하다가 빠질 수도 있음. Interface 기반으로 처리하는게 더 안전할 듯?
public class Circle implements Shape {
//    @Override
//    public void printTo(Device device) {
//        if (device instanceof Phone) {
//            System.out.println("print Circle to phone");
//        } else if (device instanceof Watch) {
//            System.out.println("print Circle to watch");
//        }
//    }

    @Override
    public void printTo(Watch watch) {
        System.out.println("h");
    }

    @Override
    public void printTo(Phone phone) {
        System.out.println("q");
    }


}
