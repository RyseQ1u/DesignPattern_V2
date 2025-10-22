package com.ryse.designpattern._13_Visitor;

import java.util.Iterator;

public class SizeVisitor extends Visitor{
    private int size;
    @Override
    public void visit(File file) {
        size+=file.getSize();
    }

    public int getSize(){
        return size;
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
}
