package com.kevin.xiehn.bilder.demo1;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 16:59
 */
public class Test {
    public static void main(String[] args) {
        Director director=new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
        System.out.println(bike.toString());
    }
}
