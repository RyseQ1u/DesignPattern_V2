package com.ryse.designpattern._14_ChainofResponsibility;

public class SpecialSupport extends Support{
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber()==number;
    }

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }
}
