package com.kevin.xiehn.decorator;

/**
 * 快餐类，对应结构中的抽象构件
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 14:18
 */
public abstract class FastFood {
    private float price;// 价格
    private String desc;// 描述

    // 计算价格
    public abstract float cast();

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
