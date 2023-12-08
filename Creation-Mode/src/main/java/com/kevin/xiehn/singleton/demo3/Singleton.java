package com.kevin.xiehn.singleton.demo3;

/**
 * 懒汉式：线程不安全
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 16:18
 */
public class Singleton {

    // 构造方法私有化
    private Singleton(){}

    // 声明静态变量
    public static Singleton instance;

    // 提供公共接口，供外部访问
    public static Singleton getInstance(){
        // 首先判断instance是否已经被创建，如果为null则先创建，如果不null则直接返回
        if(instance==null){
            // 多线程情况下会有问题
            instance=new Singleton();
        }
        return instance;
    }
}
