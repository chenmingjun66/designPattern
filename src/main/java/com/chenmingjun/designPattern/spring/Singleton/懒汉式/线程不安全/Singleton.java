package com.chenmingjun.designPattern.spring.Singleton.懒汉式.线程不安全;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 9:09
 */
public class Singleton {
    /*如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
     *还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
     * 所以在多线程环境下不可使用这种方式。
     * */

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }
}
