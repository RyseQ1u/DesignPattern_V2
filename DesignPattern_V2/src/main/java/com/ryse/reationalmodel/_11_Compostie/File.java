package com.ryse.reationalmodel._11_Compostie;

public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {

        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getsize() {
        return size;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
