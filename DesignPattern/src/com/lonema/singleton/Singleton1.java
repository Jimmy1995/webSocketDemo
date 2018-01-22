package com.lonema.singleton;

/**
 * 
 * @DESC 内存泄露版 单例模式 懒汉式
 * @AUTHOR JIANGCW
 * @DATE 2018-1-19下午05:09:39
 */
public class Singleton1 {
    private Singleton1 (){}

    private static Singleton1 singleton = null;

    public static Singleton1 getInstance() {
        if (singleton == null)
            singleton = new Singleton1();
        return singleton;
    }
    
}
