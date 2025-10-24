package com.ryse.designpattern._15_Facade.Maker;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }    //防止外部new出PageMaker的实例，所以声明为private方法

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("0_input/rysedata");
            String username = mailprop.getProperty(mailaddr);
            Path outputDir = Paths.get("1_output");
            if (!Files.exists(outputDir)) {
                Files.createDirectories(outputDir);
            }
            HtmlWriter writer = new HtmlWriter(new OutputStreamWriter(Files.newOutputStream(outputDir.resolve(filename)), StandardCharsets.UTF_8));
            writer.title("welcome to " + username + " 's page!");
            writer.paragraph(username + " 欢迎来到 " + username + " 的主页。");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("0_input/rysedata");


            Path outputDir = Paths.get("1_output");
            if (!Files.exists(outputDir)) {
                Files.createDirectories(outputDir);
            }
            HtmlWriter writer = new HtmlWriter(new OutputStreamWriter(Files.newOutputStream(outputDir.resolve(filename)), StandardCharsets.UTF_8));
            writer.title("Link page");
            for (String addr : mailprop.stringPropertyNames()) {
                String name = mailprop.getProperty(addr);
                writer.mailto(addr, name);
            }

//            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
