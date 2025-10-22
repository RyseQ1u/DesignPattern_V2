package com.ryse.designpattern._09_Bridge;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < new Random().nextInt(5)+1; i++) {
            print();
        }
        close();
    }
}
