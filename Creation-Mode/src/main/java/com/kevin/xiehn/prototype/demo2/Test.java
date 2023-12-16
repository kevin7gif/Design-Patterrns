package com.kevin.xiehn.prototype.demo2;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:22
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation=new Citation();
        Citation citation1 = citation.clone();

        citation.setName("test1");
        citation1.setName("test2");

        citation.show();
        citation1.show();

    }
}
