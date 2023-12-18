package com.kevin.xiehn.proxy.static_proxy;

/**
 * 代售站点
 * @author kevin
 * @version 1.0
 * @date 2023-12-18 16:58
 */
public class ProxyStation implements SellTickets{

    TrainStation trainStation=new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点进行增强");
        trainStation.sell();
    }
}
