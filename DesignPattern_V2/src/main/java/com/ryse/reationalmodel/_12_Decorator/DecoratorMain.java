package com.ryse.reationalmodel._12_Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Display bl = new StringDisplay("Hello,world.");
        Display b2 = new SideBorder(bl, '#');

        Display b3 = new FullBorder(b2);
        bl.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("你好，世界。")

                                                ), '*'

                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
        Display b5 = new UpDownBorder(new StringDisplay("hi,world"),'-');
        b5.show();

        MultiStringDisplay b6 = new MultiStringDisplay();
        b6.add("hi");
        b6.add("hello");
        b6.add("ryse");
        b6.show();
        Display b7 = new UpDownBorder(b6,'~');
        b7.show();
        Display b8 = new FullBorder(b6);
        b8.show();
    }
}
