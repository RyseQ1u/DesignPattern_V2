package com.ryse.designpattern._08_AbstractFactory.Factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        content.add(item);
    }
    public abstract String makeHTML();
    public void output(){
        String filename = title+".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println("编写完成");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
