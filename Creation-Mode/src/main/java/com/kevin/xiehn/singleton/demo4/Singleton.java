package com.kevin.xiehn.singleton.demo4;

/**
 * 懒汉式：线程安全
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 16:47
 */
public class Singleton {

    // 构造方法私有化
    private Singleton(){}

    // 声明静态变量
    public static Singleton instance;

    // 提供公共接口
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }


}
