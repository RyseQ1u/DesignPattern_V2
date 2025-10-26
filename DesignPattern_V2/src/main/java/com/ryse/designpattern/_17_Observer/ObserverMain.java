package com.ryse.designpattern._17_Observer;

public class ObserverMain {
    public static void main(String[] args) {

//        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator generator = new IncrementalNumberGenerator(5,15,3);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new ConcreteObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}
