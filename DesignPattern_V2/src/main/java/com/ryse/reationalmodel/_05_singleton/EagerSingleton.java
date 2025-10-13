package com.ryse.reationalmodel._05_singleton;

/**
 * 饿汉式单例
 */
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("生成了一个实例。线程ID: " + Thread.currentThread().getId());
    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
