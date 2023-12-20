package com.kevin.xiehn.adapter.class_adapter;

/**
 * 计算机类
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:17
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card should not null");
        }
        return sdCard.readSD();
    }

}
