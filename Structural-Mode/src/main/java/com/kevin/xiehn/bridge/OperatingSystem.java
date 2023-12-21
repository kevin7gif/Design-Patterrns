package com.kevin.xiehn.bridge;

/**
 * 抽象的操作系统类（抽象化角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:24
 */
public abstract class OperatingSystem {
    // 声明videoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
