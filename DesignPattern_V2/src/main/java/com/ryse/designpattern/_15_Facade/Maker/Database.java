package com.ryse.designpattern._15_Facade.Maker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {
    private Database(){}
    public static Properties getProperties(String dbname){
        String filename = dbname+".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

}
