package com.ryse.designpattern._14_ChainofResponsibility;

public class CORMain {
    public static void main(String[] args) {
        NoSupport a = new NoSupport("a");
        LimitSupport b = new LimitSupport("b", 100);
        LimitSupport c = new LimitSupport("c", 200);
        OddSurpport d = new OddSurpport("d");
        SpecialSupport e = new SpecialSupport("e", 264);
        a.setNext(b).setNext(c).setNext(d).setNext(e);
        for (int i = 0; i < 333; i+=33) {
            a.support(new Trouble(i));
        }
    }
}
