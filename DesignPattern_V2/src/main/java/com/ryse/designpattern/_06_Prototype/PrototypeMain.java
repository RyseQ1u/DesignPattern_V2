package com.ryse.designpattern._06_Prototype;

import com.ryse.designpattern._06_Prototype.Farmework.Manager;

public class PrototypeMain {
    public static void main(String[] args) {
        //创建实例与注册
        Manager mg = new Manager();
        MessageBox box1 = new MessageBox('^');
        MessageBox box2 = new MessageBox('-');
        UnderlinePen ul1 = new UnderlinePen('_');
        UnderlinePen ul2 = new UnderlinePen('=');
        mg.register("^box",box1);
        mg.register("-box",box2);
        mg.register("_ul",ul1);
        mg.register("=ul",ul2);

        //生成并使用
        mg.create("^box").use("hello,world");
        mg.create("-box").use("hello,world");
        mg.create("_ul").use("hello,world");
        mg.create("=ul").use("hello,world");
    }
}
