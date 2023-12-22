package com.kevin.xiehn.flyweight;

import java.util.HashMap;

/**
 * 工厂类，饿汉式的单例模式
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 10:45
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;
   private static volatile BoxFactory instance=new BoxFactory();

    // 在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<String,AbstractBox>();
        map.put("O", new OBox());
        map.put("I", new IBox());
        map.put("L", new LBox());
    }

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    // 定义公共接口，供外界访问
    public static BoxFactory getInstance() {
        return instance;
    }
}
