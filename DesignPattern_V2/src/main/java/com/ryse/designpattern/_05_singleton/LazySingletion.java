package com.ryse.designpattern._05_singleton;

public class LazySingletion {
    private static LazySingletion lazySingletion;

    private LazySingletion() {
        System.out.println("生成了一个实例。线程ID: " + Thread.currentThread().getId());
    }

    /**
     * 双重锁校验保证多线程环境下生成一个实例
     *
     * @return
     */
    public static LazySingletion getInstance() {
        if (lazySingletion == null) {
            synchronized (LazySingletion.class) {
                if (lazySingletion == null) {
                    lazySingletion = new LazySingletion();
                }
            }
        }
        return lazySingletion;
    }
}
