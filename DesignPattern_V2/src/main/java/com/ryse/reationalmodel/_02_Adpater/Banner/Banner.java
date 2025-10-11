package com.ryse.reationalmodel._02_Adpater.Banner;

public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    void showWithParen(){
        System.out.println("("+str+")");
    }
    void showWithAster(){
        System.out.println("*"+str+"*");
    }
}
