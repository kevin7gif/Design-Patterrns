package com.kevin.xiehn.adapter.class_adapter;

/**
 * 适配者类
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:09
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TFCard read msg：正在读取TF卡数据";
        return msg;
    }

    @Override
    public void writeTF(String data) {
        System.out.println("TFCard write msg："+data);
    }
}
