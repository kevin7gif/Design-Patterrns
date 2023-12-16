package com.kevin.xiehn.prototype.demo3;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:32
 */
public class Citation implements Cloneable{
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName()+"同学被评为三好学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}
