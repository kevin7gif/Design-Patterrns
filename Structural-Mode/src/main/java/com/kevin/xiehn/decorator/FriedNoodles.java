package com.kevin.xiehn.decorator;

/**
 * 炒面类，对应结构中的具体构件
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 14:33
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles(){
        super(12,"炒面");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
