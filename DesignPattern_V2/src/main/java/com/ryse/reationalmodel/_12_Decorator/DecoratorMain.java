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

    }
}
