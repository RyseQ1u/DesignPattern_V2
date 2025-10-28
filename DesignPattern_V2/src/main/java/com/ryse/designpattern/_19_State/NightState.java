package com.ryse.designpattern._19_State;

public class NightState implements State{
    private static NightState singleton = new NightState();
    private NightState() {

    }
    public static NightState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("使用金库(夜间)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(夜间)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("紧急通话(夜间)");
    }
    public String toString() {
        return "[夜间]";
    }
}
