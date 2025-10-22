package com.ryse.designpattern._08_AbstractFactory.Factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
