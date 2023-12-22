package com.kevin.xiehn.template;

/**
 * 炒包菜类
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 14:17
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
