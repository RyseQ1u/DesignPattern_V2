package com.ryse.designpattern.a_factory.bean;

public class CheesePizza extends  Pizza {

    @Override
    public void prepare() {
        System.out.println("完成芝士披萨");
    }
}
