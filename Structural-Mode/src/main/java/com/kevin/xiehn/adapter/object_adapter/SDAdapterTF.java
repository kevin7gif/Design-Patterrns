package com.kevin.xiehn.adapter.object_adapter;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:45
 */
public class SDAdapterTF implements SDCard {
    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(data);
    }
}
