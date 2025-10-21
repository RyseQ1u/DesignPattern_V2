package com.ryse.reationalmodel._12_Decorator;

public class FullBorder extends Border{

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return makeLine().toString();
        }else if(row == display.getRows()+1){
            return makeLine().toString();
        }else {
            return '|'+display.getRowText(row-1)+'|';
        }
    }

    private StringBuffer makeLine() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("+");
        for (int i = 0; i < display.getColumns(); i++) {
            buffer.append('-');
        }
        buffer.append("+");
        return buffer;
    }
}
