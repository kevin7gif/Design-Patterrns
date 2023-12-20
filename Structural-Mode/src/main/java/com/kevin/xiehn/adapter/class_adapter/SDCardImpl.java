package com.kevin.xiehn.adapter.class_adapter;

/**
 * 具体的SSD卡类
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:14
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SD card read：正在读取SD卡";
        return msg;
    }

    @Override
    public void writeSD(String data) {
        System.out.println("SD card write："+data);
    }
}
