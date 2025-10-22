package com.ryse.designpattern._08_AbstractFactory;

import com.ryse.designpattern._08_AbstractFactory.Factory.Item;
import com.ryse.designpattern._08_AbstractFactory.Factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator it = content.iterator();
        while (it.hasNext()){
            Item item = (Item) it.next();
            buffer.append("<tr>"+item.makeHTML()+"</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>"+author+"</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }

    public TablePage(String title, String author) {
        super(title, author);
    }
}
