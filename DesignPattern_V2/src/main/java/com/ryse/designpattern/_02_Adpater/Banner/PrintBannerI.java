package com.ryse.designpattern._02_Adpater.Banner;

public class PrintBannerI extends Banner implements IPrint{
    public PrintBannerI(String str) {
        super(str);
    }


    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
