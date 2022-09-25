package com.bianj.单例模式;


public class 测试类{
//    public static void main(String[] args) {
//        饿汉式 a = 饿汉式.get();
//        饿汉式 b = 饿汉式.get();
////        饿汉式 c = new 饿汉式();
//        System.out.println(a==b);
//    }
public static void main(String[] args) {
    懒汉式 a = 懒汉式.get();
    懒汉式 b = 懒汉式.get();
//        饿汉式 c = new 饿汉式();
        System.out.println(a==b);
}
}

class 饿汉式 {
    private 饿汉式() {}

    private static 饿汉式 getInstance = new 饿汉式();

    public static 饿汉式 get() {
        return getInstance;
    }
}

class 懒汉式{
    private 懒汉式() {}

    private static volatile 懒汉式 getInstance = null;

    public static  懒汉式 get() {
        if(getInstance == null) {
            synchronized(懒汉式.class) {
                if(getInstance == null) {
                    getInstance = new  懒汉式();
                }
            }
        }
        return getInstance;
    }
}
//        对象的创建是线程安全的。
//        支持延时加载。
//        获取对象时不需要加锁。
