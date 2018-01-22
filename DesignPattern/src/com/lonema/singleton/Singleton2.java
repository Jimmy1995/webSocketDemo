package com.lonema.singleton;

/**
 * 
 * @DESC 线程安全版 单例模式
 * @AUTHOR JIANGCW
 * @DATE 2018-1-19下午05:10:01
 */
public class Singleton2 {
    private Singleton2 (){}

    private static Singleton2 singleton = null;

    public static Singleton2 getInstance() {
        synchronized (Singleton2.class) {
            if (singleton == null) {
                singleton = new Singleton2();
            }
        }
        return singleton;
    }
}
