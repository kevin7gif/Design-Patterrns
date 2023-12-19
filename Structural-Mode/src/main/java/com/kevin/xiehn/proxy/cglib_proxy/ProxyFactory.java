package com.kevin.xiehn.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂,用来获取代理对象
 * @author kevin
 * @version 1.0
 * @date 2023-12-19 17:13
 */
public class ProxyFactory implements MethodInterceptor {
    // 声明火车站类对象
    private TrainStation trainStation=new TrainStation();
    public TrainStation getProxyObjects(){
        // 创建Enhancer对象，类似jdk动态代理中的Proxy类
        Enhancer enhancer=new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类的实例
        TrainStation trainStation= (TrainStation) enhancer.create();
        return trainStation;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强代码块");
        // 代理对象调用方法时，会执行此方法
        Object invoke = method.invoke(trainStation, objects);
        return invoke;
    }
}
