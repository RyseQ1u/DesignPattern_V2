package com.ryse.designpattern._13_Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        SizeVisitor sv = new SizeVisitor();
        this.accept(sv);
        return sv.getSize();
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
