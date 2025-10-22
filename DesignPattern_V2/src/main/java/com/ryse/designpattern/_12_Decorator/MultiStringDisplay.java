package com.ryse.designpattern._12_Decorator;

import java.util.ArrayList;

public class MultiStringDisplay extends Display{
    private ArrayList<String> rows=new ArrayList<>();
    private int len;
    public void add(String str){
        int length = str.getBytes().length;
        len = Math.max(length,len);
        rows.add(str);
    }

    @Override
    public int getColumns() {
        return len;
    }

    @Override
    public int getRows() {
        return rows.size();
    }

    @Override
    public String getRowText(int row) {
        return rows.get(row);
    }
}
