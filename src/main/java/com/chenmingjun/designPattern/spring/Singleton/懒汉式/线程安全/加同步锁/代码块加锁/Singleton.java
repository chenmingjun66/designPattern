package com.chenmingjun.designPattern.spring.Singleton.懒汉式.线程安全.加同步锁.代码块加锁;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 9:36
 */
public class Singleton {
    /*
    * 这种方法不能使用，创建的对象不是单例
    * */
    private Singleton(){

    }

    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance == null){
            /*
            *这个锁锁不住，会产生多个对象，其实这里已经很接近双重检查了，只需要要再改进一下，把产生多个对象的问题解决掉就是
            * 双重检查了，下面去看双重检查的代码
            * */
            synchronized (Singleton.class) {
                return new Singleton();
            }
        }else {
            return instance;
        }
    }
}
