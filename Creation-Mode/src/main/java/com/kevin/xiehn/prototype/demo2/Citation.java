package com.kevin.xiehn.prototype.demo2;

/**
 * 原型类
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:15
 */
public class Citation implements Cloneable{

    // 奖状上的名字
    private String name;

    public void show(){
        System.out.println(name+"同学被评为三好学生！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}
