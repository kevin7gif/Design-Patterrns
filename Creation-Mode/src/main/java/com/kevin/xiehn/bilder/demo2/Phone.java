package com.kevin.xiehn.bilder.demo2;

/**
 * 实体类
 * @author kevin
 * @version 1.0
 * @date 2023-12-16 17:31
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    // 私有构造方法
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        // 链式编程
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        // 使用构建者创建phone对象
        public Phone build(){
            return new Phone(this);
        }
    }
}
