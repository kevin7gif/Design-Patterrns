package com.kevin.xiehn.strategy;

/**
 * 具体策略类，封装算法
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 15:03
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
