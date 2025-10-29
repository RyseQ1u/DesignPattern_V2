package com.ryse.designpattern._20_FlyWeight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BigChar {
    private char charname;
    private String fontdata; // Simulated font data

    public BigChar(char charname) {

        this.charname = charname;
        try {
            Path outputDir = Paths.get("0_input/FlyWeight/big" + charname + ".txt");
            BufferedReader reader = new BufferedReader(
                    new FileReader(outputDir.toString() ));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
            this.fontdata = charname + "?";
        }
    }
    public void print() {
        System.out.print(fontdata);
    }
}
