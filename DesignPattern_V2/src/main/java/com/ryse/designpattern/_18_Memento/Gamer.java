package com.ryse.designpattern._18_Memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits =new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname=  {"苹果”，葡萄","香蕉,”橘子"};
    public Gamer(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 1;
            System.out.println("所持金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果（" + f + "）");
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生");
        }
    }
    public Memento createMemento(){
        Memento memento = new Memento(money);
        for (Object f:fruits){
            if (((String)f).startsWith("好吃的")){
                memento.addFruit((String)f);
            }
        }
        return memento;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        Iterator it = fruits.iterator();
        while (it.hasNext()){
            String f = (String) it.next();
            if(f.startsWith("好吃的")){
                memento.fruits.add(f);
            }
        }
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit(){
        String prefix = "";
        if (random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
