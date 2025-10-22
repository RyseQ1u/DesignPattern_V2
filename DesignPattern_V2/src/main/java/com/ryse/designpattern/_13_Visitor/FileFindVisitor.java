package com.ryse.designpattern._13_Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private ArrayList files = new ArrayList();
    private String type = "";

    public FileFindVisitor(String type) {
        this.type = type;
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(type)) {
            files.add(file);

        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }


    }
}
