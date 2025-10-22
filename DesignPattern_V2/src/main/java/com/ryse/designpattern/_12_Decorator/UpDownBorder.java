package com.ryse.designpattern._12_Decorator;

public class UpDownBorder extends Border{
    private  char borderChar;

    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return makeLine().toString();
        }else  if(row == display.getRows()+1){
            return makeLine().toString();
        }else {
            return display.getRowText(row-1);
        }
    }
    private StringBuffer makeLine() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < display.getColumns(); i++) {
            buffer.append('-');
        }
        return buffer;
    }
}
