package com.ryse.designpattern._21_Proxy;

public interface Printable {
    public abstract void setPrintName(String name);
    public abstract String getPrintName();
    public abstract void print(String str);
}
