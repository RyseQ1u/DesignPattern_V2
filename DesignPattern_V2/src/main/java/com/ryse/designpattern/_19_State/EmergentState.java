package com.ryse.designpattern._19_State;

public class EmergentState implements State{
    private static EmergentState singleton = new EmergentState();

    private EmergentState() {

    }
    public static EmergentState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
    }
    public void doUse(Context context) {
        context.callSecurityCenter("紧急使用金库(紧急状态)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(紧急状态)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("使用留言(紧急状态)");
    }
    public String toString() {
        return "[紧急状态]";
    }
}
