package com.ryse.designpattern._10_Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("args error" + args.length);
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player p1 = new Player("aa", new WinningStrategy(seed1));
        Player p2 = new Player("aa", new RandomStrategy(seed2));
        for (int i = 0; i < 1000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("winner:" + p1);
                p1.win();
                p2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("winner:" + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("Even");
                p1.even();
                p2.even();
            }
        }
        System.out.println("Total result");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
