package com.ryse.designpattern._09_Bridge;

public class CharDisplayImpl extends DisplayImpl {
    private char c;

    public CharDisplayImpl(char c) {
        this.c = c;
    }

    @Override
    public void rawOpen() {
        System.out.print("<");
    }

    @Override
    public void rawPrint() {
        System.out.print(c);
    }

    @Override
    public void rawClose() {
        System.out.println(">");
    }

}
