package com.ryse.reationalmodel._06_Prototype;

import com.ryse.reationalmodel._06_Prototype.Farmework.Product;

public abstract class AbsProduct implements Product {
    /**
     * 提取相同的方法在父类中实现
     * @return
     */
    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
