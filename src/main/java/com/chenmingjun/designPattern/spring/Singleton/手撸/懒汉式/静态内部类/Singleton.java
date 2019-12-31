package com.chenmingjun.designPattern.spring.Singleton.手撸.懒汉式.静态内部类;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 10:05
 */
public class Singleton {
    private Singleton(){

    }
    /*
    * 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，
    * 才会装载SingletonInstance类，从而完成Singleton的实例化。
    *
    * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，
    * JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
    * */

    static class SingletonInstance{
        static Singleton INSTANCE =  new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
