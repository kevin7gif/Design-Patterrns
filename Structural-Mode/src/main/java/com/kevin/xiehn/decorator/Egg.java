package com.kevin.xiehn.decorator;

/**
 * 鸡蛋类，对应结构中的具体装饰
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 14:59
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood,1,"鸡蛋");
    }
    @Override
    public float cast() {
        return getPrice()+getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}

