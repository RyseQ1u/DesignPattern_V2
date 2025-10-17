package com.ryse.reationalmodel._09_Bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello,china"));
        RandomDisplay d2 = new RandomDisplay(new StringDisplayImpl("hello,world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,ryse"));
        d1.display();
        d2.multiDisplay(5);
        d3.multiDisplay(5);

        CharDisplay d4 = new CharDisplay(new CharDisplayImpl('*'));
        d4.multiDisplay();
        CharDisplay d5 = new CharDisplay(new CharDisplayImpl('-'));
        d5.multiDoubleDisplay();

        Display d6 = new Display(new FileDisplayImpl("src/main/java/com/ryse/reationalmodel/_09_Bridge/data/SayGood.txt"));
        d6.display();
    }
}
