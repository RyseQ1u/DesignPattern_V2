package com.ryse.designpattern._09_Bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl{
    private String filename;
    private BufferedReader reader;
    private final   int Max_READHEAD_LIMIT = 4096;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public void rawPrint() {
        String line;

        try {
//            reader.reset();
            while (((line=reader.readLine()) !=null)) {
                System.out.println(">"+line);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }


    }

    @Override
    public void rawClose() {
        System.out.println("================================================================");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
