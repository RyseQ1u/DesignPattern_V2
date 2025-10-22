package com.ryse.designpattern.a_factory.bean;

public class GreekPizza extends  Pizza {
    @Override
    public void prepare() {
        System.out.println("完成希腊披萨");
    }
}
