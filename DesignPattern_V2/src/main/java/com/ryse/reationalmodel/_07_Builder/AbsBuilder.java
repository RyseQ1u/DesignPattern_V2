package com.ryse.reationalmodel._07_Builder;

public abstract class AbsBuilder {
    //判断是否执行过makeTitle方法
    private boolean titleMade = false;
    // 声明为 final，防止子类重写顺序逻辑
    public final void makeTitle(String title) {
        if (titleMade) {
            throw new IllegalStateException("makeTitle 方法只能被调用一次！");
        }
        titleMade = true;
        buildTitle(title); // 调用抽象方法，由子类实现
    }

    public final void makeString(String str) {
        checkTitleMade();
        buildString(str);
    }

    public final void makeItems(String[] items) {
        checkTitleMade();
        buildItems(items);
    }

    public final void close() {
        checkTitleMade();
        finish();
    }

    private void checkTitleMade() {
        if (!titleMade) {
            throw new IllegalStateException("必须首先调用 makeTitle 方法！");
        }
    }
    public abstract void buildTitle(String title);
    public abstract void buildString(String str);
    public abstract void buildItems(String[] items);
    public abstract void finish();
}
