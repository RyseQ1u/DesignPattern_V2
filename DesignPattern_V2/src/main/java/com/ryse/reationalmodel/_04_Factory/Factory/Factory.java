package com.ryse.reationalmodel._04_Factory.Factory;

public abstract class Factory {
    public final Product crate(String owner){
        Product p = crateProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product crateProduct(String owner);
    protected abstract void registerProduct(Product product);
}
