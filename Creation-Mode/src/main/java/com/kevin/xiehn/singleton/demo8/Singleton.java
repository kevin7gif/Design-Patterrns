package com.kevin.xiehn.singleton.demo8;

/**
 * 线程安全的懒汉式
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 23:47
 */
public class Singleton {
    // 构造方法私有化
    private Singleton(){}

    // 声明变量
    public static volatile Singleton instance;

    // 通过定义公共接口来访问
    public static Singleton getInstance(){
        // 第一次判断
        if(instance==null){
            // 第二次判断
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
