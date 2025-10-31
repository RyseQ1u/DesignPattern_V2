package com.ryse.designpattern._22_Command;

import com.ryse.designpattern._22_Command.Command.Command;
import com.ryse.designpattern._22_Command.Command.MacroMommand;
import com.ryse.designpattern._22_Command.Drawer.DrawCanvas;
import com.ryse.designpattern._22_Command.Drawer.DrawCommand;
import com.ryse.designpattern._22_Command.Drawer.Drawable;
import jdk.jfr.internal.tool.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;

public class CommandMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    private MacroMommand history = new MacroMommand();
    private DrawCanvas canvas = new DrawCanvas(400,400, history);
    private JButton clearButton = new JButton("clear");

    public CommandMain(String title) throws HeadlessException {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
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
        }
    }
    public void mouseMoved(java.awt.event.MouseEvent e) {
    }
    public void mouseDragged(java.awt.event.MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }
    public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
    }
    public void windowActivated(java.awt.event.WindowEvent e) {}
    public void windowClosed(java.awt.event.WindowEvent e) {}
    public void windowDeactivated(java.awt.event.WindowEvent e) {}
    public void windowDeiconified(java.awt.event.WindowEvent e) {}
    public void windowIconified(java.awt.event.WindowEvent e) {}
    public void windowOpened(java.awt.event.WindowEvent e) {}
    public static void main(String[] args) {
        new CommandMain("Command Pattern Sample");
    }
}
