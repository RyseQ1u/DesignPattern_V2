package com.ryse.reationalmodel._10_Statregy;

import java.util.Random;

public class ProbStartegy implements Strategy {
    private Random random;
    private int preHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    public ProbStartegy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue =0 ;
        if(bet<history[currentHandValue][0]){
            handvalue=0;
        }else if(bet<history[currentHandValue][0]+history[currentHandValue][1]){
            handvalue=1;
        }else {
            handvalue=2;
        }
        preHandValue =currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[preHandValue][currentHandValue]++;
        }else {
            history[preHandValue][(currentHandValue+1)%3]++;
            history[preHandValue][(currentHandValue+2)%3]++;
        }
    }
}
