package com.ryse.designpattern._08_AbstractFactory;

import com.ryse.designpattern._08_AbstractFactory.Factory.Factory;
import com.ryse.designpattern._08_AbstractFactory.Factory.Link;
import com.ryse.designpattern._08_AbstractFactory.Factory.Page;
import com.ryse.designpattern._08_AbstractFactory.Factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
