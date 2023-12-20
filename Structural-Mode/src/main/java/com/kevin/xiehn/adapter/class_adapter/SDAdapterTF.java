package com.kevin.xiehn.adapter.class_adapter;


/**
 * 适配器类
 * 需要实现目标业务接口，继承现有组件库中已存在的组件
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:20
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write tf card");
        writeTF(data);
    }
}
