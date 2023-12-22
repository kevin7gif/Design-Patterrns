package com.kevin.xiehn.flyweight;

/**
 * I图形类（具体享元角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 10:19
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
