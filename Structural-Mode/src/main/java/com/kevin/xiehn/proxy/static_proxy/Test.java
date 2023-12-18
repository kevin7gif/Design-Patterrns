package com.kevin.xiehn.proxy.static_proxy;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-18 17:00
 */
public class Test {
    public static void main(String[] args) {
        // 创建代售点类
        ProxyStation proxyStation=new ProxyStation();
        // 调用方法
        proxyStation.sell();
    }
}
