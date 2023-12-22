package com.kevin.xiehn.flyweight;

/**
 * 抽象享元角色
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 10:17
 */
public abstract class AbstractBox {

    // 获取图形的方法
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color){
        System.out.println("显示图形及颜色："+getShape()+" "+color);
    }
}
