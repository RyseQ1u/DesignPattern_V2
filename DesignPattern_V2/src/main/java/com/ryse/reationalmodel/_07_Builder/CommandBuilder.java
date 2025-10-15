package com.ryse.reationalmodel._07_Builder;

public class CommandBuilder extends AbsBuilder{
    @Override
    public void buildTitle(String title) {
        System.out.println("title:"+title);
    }

    @Override
    public void buildString(String str) {
        System.out.println("str:"+str);
    }

    @Override
    public void buildItems(String[] items) {
        System.out.println("items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    @Override
    public void finish() {
        System.out.println("done");
    }
}
