package com.ryse.designpattern._14_ChainofResponsibility;

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
