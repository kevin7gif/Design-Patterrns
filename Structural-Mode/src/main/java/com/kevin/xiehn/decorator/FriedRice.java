package com.kevin.xiehn.decorator;

/**
 * 炒饭类，对应结构中的具体构件
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 14:30
 */
public class FriedRice extends FastFood{
    public FriedRice(){
        super(10,"炒饭");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
