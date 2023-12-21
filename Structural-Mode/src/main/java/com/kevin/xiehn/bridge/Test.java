package com.kevin.xiehn.bridge;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-21 10:32
 */
public class Test {
    public static void main(String[] args) {
        OperatingSystem os = new Windows(new AviFile());
        os.play("战狼3");

        OperatingSystem os1 = new Windows(new RmvbFile());
        os1.play("战狼2");

        OperatingSystem os2 = new Mac(new AviFile());
        os2.play("战狼");
    }
}
