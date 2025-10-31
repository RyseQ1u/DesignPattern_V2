package com.ryse.designpattern._22_Command.Command;

import java.util.Stack;

public class MacroMommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
