package com.kevin.xiehn.facade;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:55
 */
public class Test {
    public static void main(String[] args) {
        // 创建智能音箱对象
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        // 控制家电
        smartAppliancesFacade.say("打开家电");
        System.out.println("===================");
        smartAppliancesFacade.say("关闭家电");
    }
}
