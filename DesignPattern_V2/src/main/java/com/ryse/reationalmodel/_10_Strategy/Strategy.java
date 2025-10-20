package com.ryse.reationalmodel._10_Strategy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);

}
