package com.ryse.reationalmodel._02_Adpater.File;

import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        IFileIo f = new FileProperties();
        try {
            f.readFromFile("D:\\Study\\Code\\Java_DesignPattern\\DesignPattern_V2\\src\\main\\java\\com\\ryse\\reationalmodel\\_02_Adpater\\File\\data\\input.txt");
            System.out.println(f.getValue("name"));
            f.setValue("last_name","bbb");
            f.setValue("age","18");
            f.setValue("Height","180");
            f.writeToFile("D:\\Study\\Code\\Java_DesignPattern\\DesignPattern_V2\\src\\main\\java\\com\\ryse\\reationalmodel\\_02_Adpater\\File\\data\\output.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
