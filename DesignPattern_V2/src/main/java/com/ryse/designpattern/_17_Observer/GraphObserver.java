package com.ryse.designpattern._17_Observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
