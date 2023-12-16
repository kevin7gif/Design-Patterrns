package com.kevin.xiehn.bilder.demo1;

/**
 * 具体的构建者，用来构建mobile单车对象
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 16:12
 */
public class MobileBuilder extends Builder{
    @Override
    public void createFrame() {
        bike.setFrame("摩拜碳纤维车架");
    }

    @Override
    public void createSeat() {
        bike.setSeat("摩拜真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
