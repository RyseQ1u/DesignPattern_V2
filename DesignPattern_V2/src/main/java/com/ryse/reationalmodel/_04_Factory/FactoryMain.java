package com.ryse.reationalmodel._04_Factory;

import com.ryse.reationalmodel._04_Factory.Factory.Factory;
import com.ryse.reationalmodel._04_Factory.Factory.Product;
import com.ryse.reationalmodel._04_Factory.IDCardFactory.IDCardFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product c1 = f.crate("小明");
        Product c2 = f.crate("小王");
        Product c3 = f.crate("小红");
        c1.use();
        c2.use();
        c3.use();
    }
}
