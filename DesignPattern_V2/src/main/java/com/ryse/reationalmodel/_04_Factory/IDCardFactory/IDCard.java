package com.ryse.reationalmodel._04_Factory.IDCardFactory;

import com.ryse.reationalmodel._04_Factory.Factory.Product;

public class IDCard extends Product {
    private  String owner;

    public IDCard(String owner) {
        System.out.println("制作"+owner+"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }
    public String getOwner(){
        return owner;
    }
}
