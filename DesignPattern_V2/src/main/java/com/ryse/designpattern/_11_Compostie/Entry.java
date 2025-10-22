package com.ryse.designpattern._11_Compostie;

public abstract class Entry {
    protected Entry parent;

    public abstract String getName();

    public abstract int getsize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }


    protected abstract void printList(String prefix);


    public String toString() {
        return getName() + "(" + getsize() + ")";
    }

    public String getFullName() {
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        do {
            fullname.insert(0, "/" + entry.getName());
            entry =entry.parent;
        } while (entry != null) ;
        return fullname.toString();
    }
}