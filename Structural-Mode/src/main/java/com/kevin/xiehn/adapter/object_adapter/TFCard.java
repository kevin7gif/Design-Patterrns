package com.kevin.xiehn.adapter.object_adapter;

/**
 * 适配者类的接口
 * @author kevin
 * @version 1.0
 * @date 2023-12-19 17:55
 */
public interface TFCard {
    // 从TF卡中读数据
    String readTF();

    // 往TF卡中写数据
    void writeTF(String data);
}
