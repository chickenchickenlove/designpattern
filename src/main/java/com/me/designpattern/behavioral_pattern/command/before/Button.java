package com.me.designpattern.behavioral_pattern.command.before;

public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
        // 버튼 인터페이스로 불을 키고 끄고 싶은데, 그렇다면 그 때 마다 메서드를 수정해야 함.
        // 이것은 Invocator(호출자)와 Receiver(수신자)가 강하게 결합되어 있어서 그렇다.
        // Button : Invocator
        // Receiver : Light
        // 그런데 Invocator나 Light를 참조하고 있으며, 메서드를 직접 실행하고 있음.
        // light.on()
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
