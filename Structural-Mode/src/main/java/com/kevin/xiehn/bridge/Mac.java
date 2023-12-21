package com.kevin.xiehn.bridge;

/**
 * Mac类（扩展抽象化角色）
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:30
 */
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
