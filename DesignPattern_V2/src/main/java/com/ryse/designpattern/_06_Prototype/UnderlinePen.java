package com.ryse.designpattern._06_Prototype;

public class UnderlinePen extends AbsProduct {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(" ");
        System.out.println("\""+ s +"\"");
        for (int i = 0; i < length+2; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
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
