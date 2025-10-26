package com.ryse.designpattern._17_Observer;

public class ConcreteObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("ConcreteObserver: " + generator.getNumber());
    }
}
