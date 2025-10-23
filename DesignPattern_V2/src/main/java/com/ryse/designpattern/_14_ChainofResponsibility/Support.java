package com.ryse.designpattern._14_ChainofResponsibility;

import java.util.ArrayList;

public abstract class Support {
    private String name;

//    private Support next;

    private ArrayList<Support> supports = new ArrayList();

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
//        this.next = next;
        supports.add(next);
        return this;
    }
    public final void support(Trouble trouble){
//        if(resolve(trouble)){
//            done(trouble);
//        }else if(next!=null){
//            next.support(trouble);
//        }else {
//            fail(trouble);
//        }
        if(resolve(trouble)){
            done(trouble);
        }else {
            for (int i = 0; i < supports.size(); i++) {
                if(supports.get(i).resolve(trouble)){
                    supports.get(i).done(trouble);
                    return;
                }
                if(i==supports.size()-1)supports.get(i).fail(trouble);
            }

        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){
        System.out.println(trouble+" is resloved by " + this +".");
    }
    protected void fail(Trouble trouble){
        System.out.println(trouble+" cannnot be resloved.");
    }
}
