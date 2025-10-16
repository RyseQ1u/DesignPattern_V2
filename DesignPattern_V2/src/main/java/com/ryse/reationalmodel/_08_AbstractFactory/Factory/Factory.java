package com.ryse.reationalmodel._08_AbstractFactory.Factory;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory =null   ;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public  abstract Link createLink(String caption,String url);
    public  abstract Tray createTray(String caption);
    public  abstract Page createPage(String title,String author);
    public   Page createYahooPage(String title,String author) {
        Link link = createLink("Yahoo!", "http://www.yahoo.com/");
        Page page = createPage("Yahoo", "yaHoo");
        page.add(link);
        return page;

    }
}
