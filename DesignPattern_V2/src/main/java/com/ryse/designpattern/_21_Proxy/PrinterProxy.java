package com.ryse.designpattern._21_Proxy;

public class PrinterProxy implements Printable{

    private String name;
    private Printer realPrinter;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrintName(String name) {
        this.name = name;
        if (realPrinter != null) {
            realPrinter.setPrintName(name);
        }
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        realPrinter.print(str);
    }
    private synchronized void realize() {
        if (realPrinter == null) {
            realPrinter = new Printer(name);
        }
    }
}
