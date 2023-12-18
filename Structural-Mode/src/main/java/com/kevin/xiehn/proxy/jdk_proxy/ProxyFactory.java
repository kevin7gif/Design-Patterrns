package com.kevin.xiehn.proxy.jdk_proxy;

import com.kevin.xiehn.proxy.static_proxy.SellTickets;
import com.kevin.xiehn.proxy.static_proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * @author kevin
 * @version 1.0
 * @date 2023-12-18 17:04
 */
public class ProxyFactory {

    // 声明一个目标对象
    private TrainStation trainStation=new TrainStation();

    // 获取代理对象的方法
    public SellTickets getProxyObjects(){
           /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxyObjects = (SellTickets)Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                       InvocationHandler中invoke方法参数说明：
                           proxy ： 代理对象
                           method ： 对应于在代理对象上调用的接口方法的 Method 实例
                           args ： 代理对象调用接口方法时传递的实际参数
                    */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk动态代理的增强方法执行了");
                        // 这里执行目标对象的方法
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                }
        );
        return trainStation;
    }
}
