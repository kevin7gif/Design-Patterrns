package com.kevin.xiehn.flyweight;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 11:06
 */
public class Test {
    public static void main(String[] args) {
        AbstractBox box = BoxFactory.getInstance().getShape("I");
        box.display("灰色");

        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        System.out.println(box==box1);
    }
}
