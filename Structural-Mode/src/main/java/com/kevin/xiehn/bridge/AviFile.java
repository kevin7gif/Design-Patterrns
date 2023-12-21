package com.kevin.xiehn.bridge;

/**
 * Avi文件（具体实现化角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:20
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Avi文件解码：" + fileName);
    }
}
