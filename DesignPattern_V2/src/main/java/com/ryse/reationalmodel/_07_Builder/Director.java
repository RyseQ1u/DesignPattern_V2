package com.ryse.reationalmodel._07_Builder;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("hello");
        builder.makeString("morning noon");
        builder.makeItems(new String[]{ "good morning","good noon"});
        builder.makeString("afternoon evening");
        builder.makeItems(new String[]{ "good afternoon","good evening","good bye"});
        builder.close();

    }
}
