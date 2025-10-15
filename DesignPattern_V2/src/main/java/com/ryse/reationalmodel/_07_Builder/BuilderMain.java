package com.ryse.reationalmodel._07_Builder;

public class BuilderMain {
    public static void main(String[] args) {

        if(args.length!=1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("plain")){
            TextBuilder tb = new TextBuilder();
            Director td = new Director(tb);
            td.construct();
            System.out.println(tb.getResult());
        }else if(args[0].equals("html")){
            HTMLBuilder hb = new HTMLBuilder();
            Director hd = new Director(hb);
            hd.construct();
            System.out.println(hb.getResult()+"文件编写完成。");
        }else if(args[0].equals("Command")){
            CommandBuilder cb = new CommandBuilder();
            AbsDirector hd = new AbsDirector(cb);
            hd.construct();
        }

        else {
            usage();
            System.exit(0);
        }
    }
    public static  void usage(){
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }
}
