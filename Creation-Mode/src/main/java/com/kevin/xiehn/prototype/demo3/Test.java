package com.kevin.xiehn.prototype.demo3;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-13 14:35
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation= new Citation();
        Student student=new Student();
        student.setName("张三");
        citation.setStu(student);

        Citation citation1 = citation.clone();
        citation1.getStu().setName("李四");

        /**
         * 浅克隆时，原型对象的引用类型的变量会随着克隆之后对象的改变而改变
         */

        citation.show();
        citation1.show();
    }
}
