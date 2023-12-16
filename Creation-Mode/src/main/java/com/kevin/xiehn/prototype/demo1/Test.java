package com.kevin.xiehn.prototype.demo1;

/**
 * 测试类
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:06
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型对象
        RealizeType realizeType = new RealizeType();

        // 调用RealizeType中的clone方法，克隆对象
        RealizeType clone = realizeType.clone();

        System.out.println("原型对象和克隆出来的对象是否为同一个？"+(realizeType==clone));
    }
}
