package com.kevin.xiehn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 0:54
 */
public class SubscriptionSubject implements Subject{
    // 定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : weiXinUserList) {
            observer.update(msg);
        }
    }
}
