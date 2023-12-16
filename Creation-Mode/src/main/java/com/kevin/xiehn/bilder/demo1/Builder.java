package com.kevin.xiehn.bilder.demo1;

/**
 * 抽象建造者类
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 16:01
 */
public abstract class Builder {
    // 声明bike类型的变量
    protected Bike bike=new Bike();

    // 声明方法
    public abstract void createFrame();
    public abstract void createSeat();

    // 构建bike
    public abstract Bike createBike();
}
