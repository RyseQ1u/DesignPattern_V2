package com.ryse.reationalmodel._03_Template;

public class StringDisplay extends AbsDisplay{
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        width   =str.getBytes().length;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
