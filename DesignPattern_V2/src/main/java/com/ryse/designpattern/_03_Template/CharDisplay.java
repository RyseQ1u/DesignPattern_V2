package com.ryse.designpattern._03_Template;

public class CharDisplay extends AbsDisplay{
    private  char   ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.println("<<<");
    }

    @Override
    protected void print() {
        System.out.println(ch);
    }

    @Override
    protected void close() {
        System.out.println(">>>");
    }
}
