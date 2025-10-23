package com.ryse.designpattern._14_ChainofResponsibility;

public class OddSurpport extends Support{
    public OddSurpport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber()%2==1;
    }
}
