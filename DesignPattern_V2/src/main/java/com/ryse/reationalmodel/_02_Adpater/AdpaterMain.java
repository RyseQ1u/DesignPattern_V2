package com.ryse.reationalmodel._02_Adpater;

import com.ryse.reationalmodel._02_Adpater.Banner.IPrint;
import com.ryse.reationalmodel._02_Adpater.Banner.Print;
import com.ryse.reationalmodel._02_Adpater.Banner.PrintBannerE;
import com.ryse.reationalmodel._02_Adpater.Banner.PrintBannerI;

public class AdpaterMain {
    public static void main(String[] args) {
        System.out.println("------implements-------");
        IPrint pi  =new PrintBannerI("hello");
        pi.printWeak();
        pi.printStrong();

        System.out.println("------extends-------");
        Print pe  =new PrintBannerE("hello");
        pe.printWeak();
        pe.printStrong();
    }
}
