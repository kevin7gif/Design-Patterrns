package com.kevin.xiehn.singleton.demo9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试序列化和反序列化是否被解决
 * @author kevin
 * @version 1.0
 * @date 2023-12-09 11:23
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // writeObjectToFile();
        readObjectFromFile();
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
