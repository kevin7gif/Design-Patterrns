package com.kevin.xiehn.singleton.demo5;

/**
 * 懒汉式：双重检查锁
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 16:59
 */
public class Singleton {
    // 构造方法私有化
    private Singleton(){}

    // 声明静态变量
    public static volatile Singleton instance;

    // 设计公共接口
    public static Singleton getInstance(){
        // 第一次判断，如果instance不为null，不需要抢占锁，直接返回
        if(instance==null){
            synchronized (Singleton.class){
                // 在加锁的过程中，如果有别的线程进来获取到了值之后，当前线程才加锁完毕，也会出现数据不一致的情况，所以进行第二次判断
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
