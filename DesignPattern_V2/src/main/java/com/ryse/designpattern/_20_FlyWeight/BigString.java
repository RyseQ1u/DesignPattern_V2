package com.ryse.designpattern._20_FlyWeight;

public class BigString {
    private BigChar[] bigchars;
    private boolean shared = true;

    public BigString(String string, boolean shared) {
        Runtime.getRuntime().gc();

        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        if (shared) {
            for (int i = 0; i < bigchars.length; i++) {
                bigchars[i] = factory.getBigChar(string.charAt(i));
            }
        } else {
            for (int i = 0; i < bigchars.length; i++) {
                bigchars[i] = new BigChar(string.charAt(i));
            }
        }
        long used1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("used memory:" + used1 + "bytes");
    }

    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
            System.out.println();
        }
        System.out.println("---------------");
    }
}
