package com.chenmingjun.designPattern.spring.Singleton.手撸.懒汉式.枚举;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/17 0017 上午 10:10
 */
enum Singleton {
    /*
    * 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
    * 这种方式是Effective Java作者Josh Bloch 提倡的方式
    * */
    //只需要Singleton.INSTANCE即可生成单例的对象
    INSTANCE;
    //下面就是类的方法
    public void say(){

    }
}
