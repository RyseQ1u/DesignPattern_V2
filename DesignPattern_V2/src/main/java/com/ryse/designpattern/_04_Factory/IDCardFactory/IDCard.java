package com.ryse.designpattern._04_Factory.IDCardFactory;

import com.ryse.designpattern._04_Factory.Factory.Product;

public class IDCard extends Product {
    private  String owner;
    private  int code;

    public IDCard(String owner, int code) {
        this.code = code;
        System.out.println("制作"+code+":"+owner+"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+code+":"+owner+"的ID卡");
    }
    public String getOwner(){
        return owner;
    }
}
