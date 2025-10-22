package com.ryse.designpattern._08_AbstractFactory;

import com.ryse.designpattern._08_AbstractFactory.Factory.Factory;
import com.ryse.designpattern._08_AbstractFactory.Factory.Link;
import com.ryse.designpattern._08_AbstractFactory.Factory.Page;
import com.ryse.designpattern._08_AbstractFactory.Factory.Tray;

public class FactoryMain {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("args error");
            System.exit(0);
        }
        Factory factorty = Factory.getFactory(args[0]);

        Link people =factorty.createLink("人民日报","http//www.people.com.cn/");
        Link gmw =factorty.createLink("光明日报","http//www.people.com.cn/");

        Link us_yahoo = factorty.createLink("Yahoo!","http//www.people.com.cn/");
        Link jp_yahoo = factorty.createLink("Yahoo!Japan","http//www.people.com.cn/");
        Link excite = factorty.createLink("Excite","http//www.people.com.cn/");
        Link google = factorty.createLink("Google","http//www.people.com.cn/");

        Tray traynews = factorty.createTray("news");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factorty.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factorty.createTray("search");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factorty.createPage("LinkPage","Ryse");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
