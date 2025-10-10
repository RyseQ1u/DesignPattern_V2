package com.ryse.reationalmodel.a_factory.bean;

public class PepperPizza extends  Pizza {
    @Override
    public void prepare() {
        System.out.println("完成辣椒披萨");
    }
}
