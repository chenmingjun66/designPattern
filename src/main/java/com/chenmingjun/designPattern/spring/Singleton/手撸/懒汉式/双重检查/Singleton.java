package com.chenmingjun.designPattern.spring.Singleton.手撸.懒汉式.双重检查;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 9:21
 */
public class Singleton {
    /*
    * 推荐使用，手撸单例的时候撸这个
    * 线程安全；延迟加载；效率较高。
    * 在实际开发中，推荐使用这种单例设计模式。
    * volatile保证共享变量修改的一致性。
    * */
    private Singleton(){
    }

    private static volatile Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    return new Singleton();
                }
            }
        }
        return instance;
    }
}
