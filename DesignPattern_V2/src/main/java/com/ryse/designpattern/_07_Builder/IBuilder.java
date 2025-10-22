package com.ryse.designpattern._07_Builder;

public interface IBuilder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
