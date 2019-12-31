package com.chenmingjun.designPattern.spring.Singleton.饿汉式;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 9:00
 */
public class Singleton {
	//饿汉式单例，static在类加载的时候就new了对象，如果后续没有代码调用这个getInstance方法不使用该该对象会造成内存浪费
	private Singleton(){

	}
	private static Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
	}
}
