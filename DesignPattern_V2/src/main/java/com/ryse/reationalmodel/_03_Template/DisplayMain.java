package com.ryse.reationalmodel._03_Template;

public class DisplayMain {
    public static void main(String[] args) {
        AbsDisplay  d1 = new CharDisplay('R');
        AbsDisplay  d2 = new StringDisplay( "Ryse");
        AbsDisplay  d3 = new StringDisplay("hello,world");
        d1.display();
        d2.display();
        d3.display();
        d1.close();
    }
}
