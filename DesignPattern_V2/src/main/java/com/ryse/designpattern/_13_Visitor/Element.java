package com.ryse.designpattern._13_Visitor;

public interface Element {
    public abstract void accept(Visitor  v);
}
