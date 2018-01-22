package com.lonema.singleton;

/**
 * 
 * @DESC 单例 饿汉式
 * @AUTHOR JIANGCW
 * @DATE 2018-1-19下午05:12:38
 */
public class Singleton3 {
	private Singleton3(){}
	
	private static Singleton3 singleton3 = new Singleton3();
	
	public static Singleton3 getInstance(){
		return singleton3;
	}
}
