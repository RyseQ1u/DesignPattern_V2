package com.ryse.designpattern._17_Observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int start;
    private int end;
    private int f;
    private int number;

    public IncrementalNumberGenerator(int start, int end, int f) {
        this.start = start;
        this.end = end;
        this.f = f;
    }

    @Override
    public int getNumber() {

        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i+=f) {
            number=i;
            notifyObservers();
        }
    }
}
