package com.kevin.xiehn.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 测试使用反射破坏单例模式
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 23:47
 */
public class Test {
    public static void main(String[] args)throws Exception{
        // 获取Singleton的字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 获取无参构造方法
        Constructor<Singleton> cons = singletonClass.getDeclaredConstructor();
        // 由于这个构造方法是私有的，所以需要取消访问检查
        cons.setAccessible(true);
        // 创建Singleton对象
        Singleton instance=(Singleton) cons.newInstance();
        Singleton instance2=(Singleton) cons.newInstance();
        // 若两个对象不相等，则说明已经破坏了单例模式
        System.out.println(instance);
        System.out.println(instance2);
    }
}
