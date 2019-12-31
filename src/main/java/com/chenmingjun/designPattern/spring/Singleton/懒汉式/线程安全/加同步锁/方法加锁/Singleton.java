package com.chenmingjun.designPattern.spring.Singleton.懒汉式.线程安全.加同步锁.方法加锁;


/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 9:16
 */
public class Singleton {
    /*
    * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题即懒汉式
    * 不推荐使用
    * */

    private Singleton(){

    }

    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if (instance == null){
            return new Singleton();
        }else {
            return instance;
        }
    }
}
