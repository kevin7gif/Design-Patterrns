package com.kevin.xiehn.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试使用反射破坏除了枚举之外的所有单例模式
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 23:24
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // writeObjectToFile();
        // 文件存的是对象的内容，读一次就相当于是拷贝了一份，读两次就相当于是拷贝了两份
        // 并不是读出来了多个对象，而是读了多次产生了多个对象
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件中读取数据
    public static void readObjectFromFile() throws Exception{
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("E:\\OneDrive\\桌面\\test.txt"));
        Singleton instance=(Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }


    // 向文件中写入数据
    public static void writeObjectToFile() throws Exception{
        // 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 创建对象输出流对象
        ObjectOutputStream oss =new ObjectOutputStream(new FileOutputStream("E:\\OneDrive\\桌面\\test.txt"));
        // 写对象
        oss.writeObject(instance);
        // 释放资源
        oss.close();
    }
}
