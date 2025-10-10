package com.ryse.reationalmodel.a_factory.bean;

public abstract class Pizza {
    private String name;

    public void  bake(){
        System.out.println("烘焙披萨...");
    }
    public void  box(){
        System.out.println("打包披萨...");
    }
    public void  cut(){
        System.out.println("切割披萨...");
    }
    public abstract void  prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
