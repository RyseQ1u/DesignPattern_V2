package com.ryse.reationalmodel._10_Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
    public RandomStrategy(int seed) {
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand( new Random().nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
