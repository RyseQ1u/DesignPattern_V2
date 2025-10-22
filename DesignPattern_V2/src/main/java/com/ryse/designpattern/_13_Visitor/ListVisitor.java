package com.ryse.designpattern._13_Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String  curDir = "";
    @Override
    public void visit(File file) {
        System.out.println(curDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(curDir+"/"+directory);
        String saveDir = curDir;
        curDir = curDir+"/"+directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        curDir =saveDir;
    }
}
