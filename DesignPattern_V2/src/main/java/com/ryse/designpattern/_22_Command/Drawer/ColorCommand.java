package com.ryse.designpattern._22_Command.Drawer;

import com.ryse.designpattern._22_Command.Command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    protected Drawable drawable;
    private Color color;
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
