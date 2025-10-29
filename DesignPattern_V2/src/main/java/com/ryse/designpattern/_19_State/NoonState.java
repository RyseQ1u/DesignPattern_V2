package com.ryse.designpattern._19_State;

public class NoonState implements State{
    private static NoonState singleton = new NoonState();
    private NoonState() {

    }
    public static NoonState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (hour < 12 || 13 <= hour) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("使用金库(中午)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(中午)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("使用留言(中午)");
    }
    public String toString() {
        return "[中午]";
    }
}
