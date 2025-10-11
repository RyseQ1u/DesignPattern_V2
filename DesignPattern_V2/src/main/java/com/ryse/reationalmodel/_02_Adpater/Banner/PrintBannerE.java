package com.ryse.reationalmodel._02_Adpater.Banner;

public class PrintBannerE extends Print{
    private Banner banner;

    public PrintBannerE(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
