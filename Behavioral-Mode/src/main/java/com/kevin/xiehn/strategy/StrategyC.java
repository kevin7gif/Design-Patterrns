package com.kevin.xiehn.strategy;

/**
 * 具体策略类，封装算法
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 15:03
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
