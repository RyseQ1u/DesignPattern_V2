package com.ryse.designpattern._13_Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ELementArrayList implements Element {
    private ArrayList<Element> list =new ArrayList<>();

    public Element add(Element entry)  {
        list.add(entry);
        return this;
    }

    @Override
    public void accept(Visitor v) {
        Iterator<Element> it = list.iterator();
        while (it.hasNext()){
            Element next = (Element)it.next();
            next.accept(v);
        }
    }
}
