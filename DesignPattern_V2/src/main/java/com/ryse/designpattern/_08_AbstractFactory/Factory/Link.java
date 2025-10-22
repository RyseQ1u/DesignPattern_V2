package com.ryse.designpattern._08_AbstractFactory.Factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
