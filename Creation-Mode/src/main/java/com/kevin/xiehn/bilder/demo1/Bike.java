package com.kevin.xiehn.bilder.demo1;

/**
 * 产品类型
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 15:58
 */
public class Bike {
    // 车架
    private String frame;
    // 车座
    private String seat;

    public Bike(String frame, String seat) {
        this.frame = frame;
        this.seat = seat;
    }

    public Bike() {
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
