package com.kevin.xiehn.singleton.demo2;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 16:11
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance);
        System.out.println(instance1==instance);
    }
}
