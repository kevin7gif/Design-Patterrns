package com.kevin.xiehn.bridge;

/**
 * Windows类（扩展抽象化角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:28
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
