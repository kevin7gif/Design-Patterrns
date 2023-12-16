package com.kevin.xiehn.prototype.demo1;

/**
 * 浅克隆
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:03
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型函数创建完成");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealizeType)super.clone();
    }
}
