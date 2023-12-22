package com.kevin.xiehn.template;

/**
 * 炒菜心类
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 14:19
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
