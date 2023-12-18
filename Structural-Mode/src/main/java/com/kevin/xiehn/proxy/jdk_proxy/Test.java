package com.kevin.xiehn.proxy.jdk_proxy;

import com.kevin.xiehn.proxy.static_proxy.SellTickets;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-18 17:15
 */
public class Test {
    public static void main(String[] args) {
        // 创建代理对象
        ProxyFactory proxyFactory=new ProxyFactory();
        // 通过代理对象的工厂获取代理对象
        SellTickets proxyObjects = proxyFactory.getProxyObjects();
        // 调用代理对象的方法
        proxyObjects.sell();
    }
}
