package com.kevin.xiehn.proxy.static_proxy;

/**
 * 火车站
 * @author kevin
 * @version 1.0
 * @date 2023-12-18 16:56
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
