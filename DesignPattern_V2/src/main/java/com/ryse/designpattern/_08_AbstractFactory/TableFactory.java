package com.ryse.designpattern._08_AbstractFactory;

import com.ryse.designpattern._08_AbstractFactory.Factory.Factory;
import com.ryse.designpattern._08_AbstractFactory.Factory.Link;
import com.ryse.designpattern._08_AbstractFactory.Factory.Page;
import com.ryse.designpattern._08_AbstractFactory.Factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
