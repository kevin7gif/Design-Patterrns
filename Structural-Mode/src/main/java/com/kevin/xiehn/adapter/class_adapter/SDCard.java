package com.kevin.xiehn.adapter.class_adapter;

/**
 * 目标接口
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:12
 */
public interface SDCard {
    // 从SD卡中读取数据
    String readSD();

    // 往SD卡中写数据
    void writeSD(String data);
}
