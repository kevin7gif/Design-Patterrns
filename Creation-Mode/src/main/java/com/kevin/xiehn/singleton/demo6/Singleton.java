package com.kevin.xiehn.singleton.demo6;

/**
 * 懒汉式：静态内部类
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 17:24
 */
public class Singleton {

    // 构造方法私有化
    private Singleton(){}

    // 定义静态内部类
    private static class SingletonHolder{
        public static final Singleton INSTANCE=new Singleton();
    }

    // 提供公共接口
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
