package com.kevin.xiehn.observer;

/**
 * 具体的观察者角色类
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 0:59
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name +"---"+ msg);
    }
}
