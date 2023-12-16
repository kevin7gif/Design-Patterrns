package com.kevin.xiehn.bilder.demo1;

/**
 * 指挥类
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 16:47
 */
public class Director {
    // 声明builder变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 创建产品
    public Bike construct() {
        // 指挥者调用各个建造者的建造方法
        builder.createFrame();
        builder.createSeat();
        builder.createBike();
        // 指挥者返回产品
        return builder.createBike();
    }
}
