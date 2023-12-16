package com.kevin.xiehn.bilder.demo2;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 17:45
 */
public class Test {
    public static void main(String[] args) {
        // 创建手机
        Phone phone=new Phone.Builder()
                .setCpu("intel")
                .setMainBoard("华硕")
                .setMemory("金士顿")
                .setScreen("三星")
                .build();
    }
}
