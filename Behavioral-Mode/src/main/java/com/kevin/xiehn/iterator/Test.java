package com.kevin.xiehn.iterator;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:52
 */
public class Test {
    public static void main(String[] args) {
        // 创建聚合对象
        StudentAggregate aggregate = new StudentAggregateImpl();
        // 添加元素
        aggregate.addStudent(new Student("张三","001"));
        aggregate.addStudent(new Student("李四","002"));
        aggregate.addStudent(new Student("王五","003"));
        aggregate.addStudent(new Student("赵六","004"));
        aggregate.addStudent(new Student("沈七","005"));

        // 遍历聚合对象
        // 获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        // 遍历
        while(iterator.hasNext()){
            // 获取元素
            Student next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
