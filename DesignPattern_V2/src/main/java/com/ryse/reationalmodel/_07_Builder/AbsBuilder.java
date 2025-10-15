package com.ryse.reationalmodel._07_Builder;

public abstract class AbsBuilder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
