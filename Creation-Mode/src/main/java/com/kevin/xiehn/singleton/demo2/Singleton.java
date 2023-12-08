package com.kevin.xiehn.singleton.demo2;

/**
 * 饿汉式：静态代码块
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 15:58
 */
public class Singleton {
    // 构造方法私有化
    private Singleton(){}

    // 声明静态变量
    public static Singleton instance;// null

    // 在静态代码块中赋值
    static {
        instance=new Singleton();
    }

    // 定义公共接口，用于访问变量
    public static Singleton getInstance(){
        return instance;
    }
}
