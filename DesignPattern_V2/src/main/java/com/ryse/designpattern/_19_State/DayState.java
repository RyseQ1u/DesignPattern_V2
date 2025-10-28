package com.ryse.designpattern._19_State;

public class DayState implements State{
    private static DayState singleton = new DayState();
    private DayState() {

    }
    public static DayState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }
    public String toString() {
        return "[白天]";
    }

}
