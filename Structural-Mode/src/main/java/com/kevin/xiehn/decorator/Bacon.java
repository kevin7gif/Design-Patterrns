package com.kevin.xiehn.decorator;

/**
 * 培根类，对应结构中的具体装饰
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 15:06
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood){
        super(fastFood,5,"培根");
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
