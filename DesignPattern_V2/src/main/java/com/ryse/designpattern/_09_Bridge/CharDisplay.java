package com.ryse.designpattern._09_Bridge;

import java.util.Random;

public class CharDisplay extends Display {
    public CharDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay() {
        int n = new Random().nextInt(5) + 1;
        for (int i = 0; i < n; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();

            }
            close();
        }
    }

    public void multiDoubleDisplay() {
        int n = new Random().nextInt(5) + 1;
        for (int i = 0; i < n; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();
                print();
            }
            close();
        }
    }
}
