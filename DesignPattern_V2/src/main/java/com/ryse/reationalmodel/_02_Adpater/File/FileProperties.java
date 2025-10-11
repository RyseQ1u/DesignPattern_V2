package com.ryse.reationalmodel._02_Adpater.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties implements IFileIo{
    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        properties.load(input);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        FileOutputStream output = new FileOutputStream(fileName);
        properties.store(output,null);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
