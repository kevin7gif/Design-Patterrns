package com.kevin.xiehn.proxy.cglib_proxy;


/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-19 17:25
 */
public class Test {
    public static void main(String[] args) {
        // 创建代理对象工厂
        ProxyFactory factory=new ProxyFactory();
        // 创建代理对象
        TrainStation proxyObjects = factory.getProxyObjects();
        // 调用目标对象的方法
        proxyObjects.sell();
    }
}
