package com.ryse.designpattern._21_Proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Creating Printer instance");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Creating Printer instance with name: " + name);
    }

    @Override
    public void setPrintName(String name) {
        this.name = name;
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("done.");
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + name + " ===");
        System.out.println(str);
    }
}
