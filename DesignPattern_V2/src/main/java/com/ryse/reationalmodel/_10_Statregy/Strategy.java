package com.ryse.reationalmodel._10_Statregy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);

}
