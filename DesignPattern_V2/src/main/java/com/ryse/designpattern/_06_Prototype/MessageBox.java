package com.ryse.designpattern._06_Prototype;

public class MessageBox extends AbsProduct {
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    private char decochar;

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
//    //在父类中提供了默认实现
//    @Override
//    public Product createClone() {
//        Product p = null;
//        try {
//            p = (Product) this.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }
}
