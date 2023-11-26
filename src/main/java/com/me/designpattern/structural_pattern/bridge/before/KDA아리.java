package com.me.designpattern.structural_pattern.bridge.before;

// 현재 구조에서는 챔피언이 추가되거나, 스킨이 추가될때 마다 새로운 클래스가 만들어져야함.
// 챔피언이 좀 더 추상화 됨(고차원) → 스킨은 좀 더 구체적인 부분임.
// 고차원 / 저차원으로 나눌 수 있음
// 고차원이 저차원을 인터페이스 형태로 사용하도록 할 수 있음.

public class KDA아리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아리 R");
    }

}
