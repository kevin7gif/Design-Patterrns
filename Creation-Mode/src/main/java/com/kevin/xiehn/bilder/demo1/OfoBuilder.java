package com.kevin.xiehn.bilder.demo1;

/**
 * 具体的构建者，用来构建ofo单车对象
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 16:18
 */
public class OfoBuilder extends Builder{
    @Override
    public void createFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void createSeat() {
        bike.setSeat("ofo座椅");
        System.out.println("第一次测试");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
