package com.kevin.xiehn.adapter.class_adapter;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-20 10:27
 */
public class Test {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer=new Computer();
        // 创建SD卡对象
        SDCard sdCard=new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("--------------------------");

        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter));
    }
}
