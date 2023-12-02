package com.me.designpattern.behavioral_pattern.command.after;

import com.me.designpattern.behavioral_pattern.command.after.command.Command;
import com.me.designpattern.behavioral_pattern.command.after.command.GameStartCommand;
import com.me.designpattern.behavioral_pattern.command.after.command.LightOffCommand;
import com.me.designpattern.behavioral_pattern.command.after.command.LightOnCommand;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        this.commands.add(command);
        command.execute();
    }

    public void undo() {
        Command command = this.commands.pop();
        command.undo();
    }


    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.undo();

        button.press(new GameStartCommand(new Game()));
        button.undo();
    }
}

// 자주 변하지 않는 것 - 주로 변하는 것을 연결할 때 인터페이스로 연결해준다.
// 만약 이렇게 하지 않았으면 Light에 새로운 기능이 추가될 때 마다 Button에 반영되어야 했을 것이다. (Button에 새로운 메서드가 추가되는 형식)
// 이렇게 처리하면서 자주 변하지 않는 부분을 자주 변하는 것과 디커플링 시켜두었다.