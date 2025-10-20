package com.ryse.reationalmodel._11_Compostie;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
private String name;
private ArrayList directory = new ArrayList();
public Directory(String name){
    this.name=name;
}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getsize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            size+=entry.getsize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix+"/"+name);
        }
    }
}
