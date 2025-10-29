package com.ryse.designpattern._19_State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener,Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);

    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonEemergent = new Button("紧急状态");
    private Button buttonExit = new Button("结束");

    private State state = DayState.getInstance();
    private boolean inEemergent = false;

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonEemergent);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        setVisible(true);

        buttonUse.addActionListener(e -> state.doUse(this));
        buttonAlarm.addActionListener(e -> state.doAlarm(this));
        buttonPhone.addActionListener(e -> state.doPhone(this));
        buttonEemergent.addActionListener(e -> {
            if(!inEemergent)
                changeState(EmergentState.getInstance());
            else{
                changeState(DayState.getInstance());
            }
            inEemergent=!inEemergent;
        });
        buttonExit.addActionListener(e -> System.exit(0));
    }

    public void setClock(int hour) {
        String clockString = "现在时间是";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        if(!inEemergent){
            state.doClock(this, hour);
        }
    }

    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else if (e.getSource() == buttonEemergent) {
            state = EmergentState.getInstance();
        }
    }
}
