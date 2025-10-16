package com.ryse.reationalmodel._08_AbstractFactory;

import com.ryse.reationalmodel._08_AbstractFactory.Factory.Item;
import com.ryse.reationalmodel._08_AbstractFactory.Factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</head></title>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()){
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<address>"+author+"</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
