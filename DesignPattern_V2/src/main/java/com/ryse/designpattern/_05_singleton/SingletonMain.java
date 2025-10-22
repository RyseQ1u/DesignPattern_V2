package com.ryse.designpattern._05_singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("=== 单线程 ===");
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        if(s1==s2){
            System.out.println("s1 == s2");
        }else {
            System.out.println("s1 != s2");
        }

        System.out.println("=== 多线程 ===");

        // 创建并启动多个线程
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                LazySingletion s = LazySingletion.getInstance();
                System.out.println("线程 " + Thread.currentThread().getId() + " 获取到的实例哈希码: " + s.hashCode());
            });
            thread.start();
        }
    }
}
