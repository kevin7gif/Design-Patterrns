package com.kevin.xiehn.bridge;

/**
 * Rmvb文件（具体实现化角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:22
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Rmvb文件解码："+fileName);
    }
}
