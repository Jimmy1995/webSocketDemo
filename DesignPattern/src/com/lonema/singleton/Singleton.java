package com.lonema.singleton;

/**
 * 
 * @DESC 推荐版 单例模式
 * @AUTHOR JIANGCW
 * @DATE 2018-1-19下午05:08:48
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    private Singleton(){}
    
    private static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
}
