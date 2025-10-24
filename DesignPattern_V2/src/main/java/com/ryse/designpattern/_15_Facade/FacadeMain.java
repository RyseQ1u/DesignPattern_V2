package com.ryse.designpattern._15_Facade;

import com.ryse.designpattern._15_Facade.Maker.PageMaker;

public class FacadeMain {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("username","welcome.html");
    }
}
