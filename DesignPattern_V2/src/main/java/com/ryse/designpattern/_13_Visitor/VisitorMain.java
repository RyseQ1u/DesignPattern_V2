package com.ryse.designpattern._13_Visitor;

import java.util.Iterator;

public class VisitorMain {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir=new Directory("root");
        Directory bindir =new Directory("bin");
        Directory tmpdir=new Directory("tmp");
        Directory usrdir= new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi",1000));
        bindir.add(new File("latex",2000));
        rootdir.accept(new ListVisitor());
        System.out.println();
        System.out.println("Making user entries...");
        Directory yuki=new Directory("yuki");
        Directory hanako=new Directory("hanako");
        Directory tomura=new Directory("tomura");
        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);
        yuki.add(new File("diary.html",100));
        yuki.add(new File("Composite.java",2200));
        hanako.add(new File("memo.tex",300));
        tomura.add(new File("game.doc",400));
        tomura.add(new File("junk.mail",500));
        rootdir.accept(new ListVisitor());
        System.out.println();
        FileFindVisitor ffv = new FileFindVisitor(".mail");
        rootdir.accept(ffv);
        Iterator it = ffv.getFoundFiles();
        while (it.hasNext()){
            File file =(File)it.next();
            System.out.println(file);
        }
        System.out.println();
        ELementArrayList list= new ELementArrayList();
        list.add(rootdir);
        list.add(usrdir);
        list.add(new File("hello.txt",2345));
        list.accept(new ListVisitor());
    }
}
