package com.kevin.xiehn.strategy;

import com.kevin.xiehn.template.ConcreteClass_BaoCai;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 15:13
 */
public class Test {
    public static void main(String[] args) {
        SalesMan a = new SalesMan(new StrategyA());
        a.salesManShow();

        SalesMan b = new SalesMan(new StrategyB());
        b.salesManShow();

        SalesMan c = new SalesMan(new StrategyC());
        c.salesManShow();
    }
}
