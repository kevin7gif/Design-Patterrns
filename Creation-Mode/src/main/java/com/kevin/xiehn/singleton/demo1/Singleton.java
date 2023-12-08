package com.kevin.xiehn.singleton.demo1;

/**
 * 饿汉式：静态成员变量
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 15:58
 */
public class Singleton {

    // 构造函数私有化
    private Singleton() {
    }

    // 创建静态成员变量
    public static Singleton instance=new Singleton();

    // 设计一个公共的访问接口
    public static Singleton getInstance(){
        return instance;
    }
}
