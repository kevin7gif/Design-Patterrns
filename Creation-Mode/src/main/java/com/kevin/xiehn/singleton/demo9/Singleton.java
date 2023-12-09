package com.kevin.xiehn.singleton.demo9;

import java.io.Serializable;

/**
 * 静态内部类的懒汉式
 * @author kevin
 * @version 1.0
 * @date 2023-12-09 11:23
 */
public class Singleton implements Serializable {
    // 构造方法私有化
    private Singleton(){}


    // 使用静态内部类声明变量并赋值
    public static class SingletonHolder{
        public static final Singleton INSTANCE=new Singleton();
    }

    // 提供公共访问接口
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时，会自动调用这个方法
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
