package com.kevin.xiehn.decorator;

/**
 * 装饰者类，对应结构中的抽象装饰
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 14:42
 */
public abstract class Garnish extends FastFood{
   // 声明快餐类的变量
    private FastFood fastFood;

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
