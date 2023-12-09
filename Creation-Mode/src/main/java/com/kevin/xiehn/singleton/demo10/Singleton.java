package com.kevin.xiehn.singleton.demo10;

/**
 * 静态内部类的懒汉式
 * @author kevin
 * @version 1.0
 * @date 2023-12-09 11:49
 */
public class Singleton {
    // 定义变量，用于判断是否是第一次创建对象
    private volatile static boolean flag = false;

    // 构造方法私有化
    private Singleton(){
        synchronized (Singleton.class){
            if(flag==true){
                throw  new RuntimeException("不能创建多个对象");
            }
            flag=true;
        }
    }

    // 创建静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE= new Singleton();
    }

    // 提供公共接口访问
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
