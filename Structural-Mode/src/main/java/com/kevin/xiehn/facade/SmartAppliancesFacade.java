package com.kevin.xiehn.facade;

/**
 * 外观类
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:51
 */
public class SmartAppliancesFacade {

    // 聚合电灯对象，电视机对象，空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade(){
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 通过语音控制
    public void say(String msg){
        if(msg.contains("打开")){
            on();
        } else if (msg.contains("关闭")) {
            off();
        }else {
            System.out.println("听不懂。。。。。。");
        }
    }

    private void on(){
        System.out.println("开关开启");
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        System.out.println("开关关闭");
        light.off();
        tv.off();
        airCondition.off();
    }
}
