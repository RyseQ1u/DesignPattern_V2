package com.ryse.designpattern._21_Proxy;

public class ProxyMain {
    public static void main(String[] args) {

        Printable p = new PrinterProxy("Alice");
        System.out.println("Current Printer Name: " + p.getPrintName());
        p.setPrintName("ryse");
        System.out.println("Current Printer Name: " + p.getPrintName());
        p.print("Hello, world!");
    }
}
