package com.bianj.单例模式;

public class 静态内部类 {
    private 静态内部类() {   }
    private static class 内部类{
        private static final 静态内部类 instance = new 静态内部类();
    }
    public static 静态内部类 getInstance() {
        return 内部类.instance;
    }
}
//        对象的创建是线程安全的。
//        支持延时加载。
//        获取对象时不需要加锁。