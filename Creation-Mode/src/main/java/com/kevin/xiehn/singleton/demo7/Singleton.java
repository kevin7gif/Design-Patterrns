package com.kevin.xiehn.singleton.demo7;

import java.io.Serializable;

/**
 * 采用静态内部类的懒汉式单例模式
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 23:22
 */
public class Singleton implements Serializable {
    // 构造方法私有化
    private Singleton(){}

    // 使用静态内部类对变量赋值
    private static class SingletonHolder{
        public static final Singleton INSTANCE=new Singleton();
    }

    // 提供公共接口供外部访问
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
