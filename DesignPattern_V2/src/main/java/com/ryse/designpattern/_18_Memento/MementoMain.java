package com.ryse.designpattern._18_Memento;

public class MementoMain {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(2);
        Memento memento = gamer.createMemento();
        for(int i = 0; i < 10; i++){
            System.out.println("==== " + i);
            System.out.println("現狀：" + gamer);

            gamer.bet();

            System.out.println("所持金錢為：" + gamer.getMoney() + "元");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("（所持金錢增加了，保存遊戲狀態）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("（所持金錢減少了，恢復到以前的狀態）");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
