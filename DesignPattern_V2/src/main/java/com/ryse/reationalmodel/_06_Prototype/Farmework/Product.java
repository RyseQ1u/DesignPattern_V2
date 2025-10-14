package com.ryse.reationalmodel._06_Prototype.Farmework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
