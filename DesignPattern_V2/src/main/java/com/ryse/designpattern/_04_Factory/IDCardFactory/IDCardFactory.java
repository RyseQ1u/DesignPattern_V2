package com.ryse.designpattern._04_Factory.IDCardFactory;

import com.ryse.designpattern._04_Factory.Factory.Factory;
import com.ryse.designpattern._04_Factory.Factory.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product crateProduct(String owner) {
        return new IDCard(owner,owners.size()+1);
    }

    @Override
    protected void registerProduct(Product product) {
         owners.add(((IDCard)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
