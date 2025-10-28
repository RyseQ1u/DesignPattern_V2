package com.ryse.designpattern._19_State;

public class StateMain {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        for (int hour = 0; hour < 24; hour++) {
            frame.setClock(hour);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
