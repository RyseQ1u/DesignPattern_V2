package com.ryse.designpattern._21_Proxy;

public class PrinterProxy implements Printable{

    private String name;
    private String className;
    private Printable realPrinter;

    public PrinterProxy() {
    }

    public PrinterProxy(String name,String className){
        this.name = name;
        this.className = className;
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
            try {
                realPrinter = (Printable) Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
