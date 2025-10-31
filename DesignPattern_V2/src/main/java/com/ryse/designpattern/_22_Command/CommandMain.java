package com.ryse.designpattern._22_Command;

import com.ryse.designpattern._22_Command.Command.Command;
import com.ryse.designpattern._22_Command.Command.MacroMommand;
import com.ryse.designpattern._22_Command.Drawer.ColorCommand;
import com.ryse.designpattern._22_Command.Drawer.DrawCanvas;
import com.ryse.designpattern._22_Command.Drawer.DrawCommand;
import com.ryse.designpattern._22_Command.Drawer.Drawable;
import jdk.jfr.internal.tool.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommandMain extends JFrame implements ActionListener {
    private MacroMommand history = new MacroMommand();
    private DrawCanvas canvas = new DrawCanvas(400,400, history);
    //清空按钮
    private JButton clearButton = new JButton("clear");

    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");

    private JButton undoButton = new JButton("undo");



    public CommandMain(String title) throws HeadlessException {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        canvas.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            Command cmd = new ColorCommand(canvas, Color.RED);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == greenButton) {
            Command cmd = new ColorCommand(canvas, Color.GREEN);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == blueButton) {
            Command cmd = new ColorCommand(canvas, Color.BLUE);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }

    public static void main(String[] args) {
        new CommandMain("Command Pattern Sample");
    }
}
