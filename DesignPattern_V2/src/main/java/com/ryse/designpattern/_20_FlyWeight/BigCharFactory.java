package com.ryse.designpattern._20_FlyWeight;

public class BigCharFactory {
    private BigChar[] pool = new BigChar[10];

    private BigCharFactory()  {}
    private static BigCharFactory singleton = new BigCharFactory();
    public static BigCharFactory getInstance() {
        return singleton;
    }
    public synchronized BigChar getBigChar(char charname) {
        if (charname < '0' || charname > '9') {
            charname = '0';
        }
        int index = charname - '0';
        if (pool[index] == null) {
            pool[index] = new BigChar(charname);
        }
        return pool[index];
    }

}
